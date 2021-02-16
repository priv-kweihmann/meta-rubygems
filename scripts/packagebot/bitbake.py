import glob
import os
import re
import subprocess


class Bitbake():

    def __init__(self, default_target):
        self.__default_target = default_target
        self.__bitbake_interna = self.__get_interna()

    def __get_interna(self):
        res = {}
        try:
            out = subprocess.check_output(
                ["bitbake", "-e", self.__default_target], universal_newlines=True)
            for m in re.finditer(r"^(?P<var>.*?)=\"(?P<value>.*)\"$", out, re.MULTILINE):
                res[m.group("var")] = m.group("value")
        except Exception:
            pass
        return res

    def __get_latest_console_log(self):
        _path = os.path.join(os.path.dirname(
            self.__bitbake_interna["BB_CONSOLELOG"]), "console-latest.log")
        with open(_path) as i:
            return i.read()
        return ""

    def __read_task_log(self, recipename, version, task):
        for f in glob.glob(os.path.join(self.__bitbake_interna["BASE_WORKDIR"],
                                        "*", recipename, version + "-*",
                                        "temp", "log." + task)):
            with open(f) as i:
                return i.read()
        return ""

    def __get_failing_task_log(self):
        _pattern = r"^ERROR:\s+Task\s+\(/(.*/)*(?P<recipe>.*)_(?P<version>.*?)\.bb:(?P<task>.*)\)\s+failed.*"
        _input = self.__get_latest_console_log()
        res = []
        for m in re.finditer(_pattern, _input, re.MULTILINE):
            res.append("```\n" + self.__read_task_log(m.group("recipe"),
                                                      m.group("version"), m.group("task")) + "\n```")
        return "\n".join(res)

    def __build(self, target):
        try:
            subprocess.check_call(["bitbake", target])
            return (True, None)
        except subprocess.CalledProcessError:
            # find failing task and task log
            return (False, self.__get_failing_task_log())

    def build(self, target=None):
        return self.__build(target if target else self.__default_target)

    def get_recipe_path(self, recipename):
        try:
            out = subprocess.check_output(
                ["bitbake-layers", "show-recipes", "-f", recipename], universal_newlines=True)
            return [x for x in out.split("\n") if x][-1]
        except subprocess.CalledProcessError:
            pass
        return ""
