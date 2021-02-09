import os

from oelint_adv.cls_rule import Rule
from oelint_parser.helper_files import expand_term
from oelint_parser.helper_files import get_layer_root


class RubygemsTestCase(Rule):

    TESTCASE_DIR = "lib/oeqa/runtime/cases"

    def __init__(self):
        super().__init__(id="rubygems.testcase",
                         severity="error",
                         message="Recipe has to have a test case")

    def __sanitize_pn(self, name):
        return name.replace("@", "").replace("/", "-").replace("-", "_")

    def __needle_to_search_for(self, name):
        return "class RubyGemsTest{pn}(RubyGemsTestUtils)".format(pn=self.__sanitize_pn(name))

    def check(self, _file, stash):
        res = []
        if "recipes-rubygems/" not in _file:
            return []
        found = False
        _pn = expand_term(stash, _file, "${PN}")
        _layer_root = get_layer_root(_file)
        _needle = self.__needle_to_search_for(_pn)
        for root, dirs, files in os.walk(os.path.join(_layer_root, RubygemsTestCase.TESTCASE_DIR)):
            for f in files:
                if not f.endswith(".py"):
                    continue
                with open(os.path.join(root, f)) as i:
                    if _needle in i.read():
                        found = True
                        break
        if not found:
            res += self.finding(_file, 1)
        return res
