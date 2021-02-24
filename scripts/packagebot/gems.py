# SPDX-License-Identifier: MIT
# Copyright (c) 2021, Konrad Weihmann

import glob
import os
import subprocess

from oelint_parser.cls_item import Variable
from oelint_parser.cls_stash import Stash
from oelint_parser.helper_files import expand_term


class Gem():

    def __init__(self, path, git, bitbake, github, pkggroup, new=False):
        self.__gitref = git
        self.__bitbakeref = bitbake
        self.__githubref = github
        self.__new_gem = new
        self.__pkggroup = pkggroup
        self.__dir = os.path.dirname(path)

        # initial update
        self.__gem_name, self.__gem_version, self.__depends_on = self.__extract_info(
            path)

    def __get_recipename(self, name=None):
        name = self.__gem_name if not name else name
        return "rubygems-%s" % (name.replace("@", "").replace("/", "-").replace("_", "-"))

    def __repr__(self):
        return "{}-{} -> {}".format(self.__gem_name, self.__gem_version, self.__depends_on)

    @property
    def dependant_recipes(self):
        return self.__depends_on

    @property
    def recipename(self):
        return self.__get_recipename()

    @property
    def update_message(self):
        if self.__new_gem:
            return ("{}: add new gem".format(self.__gem_name), "As it is needed as a new dependency")
        return ("{}: update to {}".format(self.__gem_name, self.__gem_version), "")

    @property
    def fail_message(self):
        if self.__new_gem:
            return "{}: failed to create gem".format(self.__gem_name)
        return "{}: failed to update to {}".format(self.__gem_name, self.__gem_version)

    def __extract_info(self, path):
        _stash = Stash(quiet=True)
        _stash.AddFile(path)
        _stash.Finalize()

        name = None
        version = None
        depends = set()

        version = expand_term(_stash, path, "${PV}")
        for item in _stash.GetItemsFor(attribute=Variable.ATTR_VAR, attributeValue="GEM_NAME"):
            name = item.VarValueStripped
        depends = set()
        for item in _stash.GetItemsFor(attribute=Variable.ATTR_VAR, attributeValue="RDEPENDS_${PN}"):
            depends.update([expand_term(_stash, path, y)
                            for y in item.get_items() if y not in ["\\", "\\\n", '"']])
        for item in _stash.GetItemsFor(attribute=Variable.ATTR_VAR, attributeValue="EXTRA_RDEPENDS"):
            depends.update([expand_term(_stash, path, y)
                            for y in item.get_items() if y not in ["\\", "\\\n", '"']])

        return (name, version, depends)

    def __run_ruby_gen(self, args):
        try:
            subprocess.check_call(args)
        except Exception:
            pass

    def __patch_packagegroup(self, newrecipes):
        _path = self.__bitbakeref.get_recipe_path(self.__pkggroup)

        _stash = Stash(quiet=True)
        _stash.AddFile(_path)
        _stash.Finalize()

        _rdepends = set([self.__get_recipename(name=x) for x in newrecipes])

        for item in _stash.GetItemsFor(attribute=Variable.ATTR_VAR, attributeValue="RDEPENDS_${PN}"):
            _rdepends.update(item.get_items())
            item.RealRaw = '{}{}"\\\n    {} \\\n"'.format(item.VarName, item.VarOp, " \\\n    ".join(sorted(_rdepends)))
            item.Raw = item.RealRaw

        items = _stash.GetItemsFor(filename=_path, nolink=True)
        with open(_path, "w") as o:
            o.write("".join([x.RealRaw for x in items]))
            o.write("\n")

    def __get_new_recipes(self):
        _new_recipes = set()
        for c in self.__gitref.newfiles:
            if c.endswith(".bb"):
                name, _, _ = self.__extract_info(os.path.join(self.__gitref.root, c))
                if name != self.__gem_name:
                    _new_recipes.add(name)
        if any(_new_recipes):
            self.__patch_packagegroup(_new_recipes)

    def attempt_update(self, repo_root, script="scripts/ruby-gen"):
        print("Attempt update of {}...".format(self.recipename), end="")
        self.__run_ruby_gen(
            [os.path.join(repo_root, script), self.__dir, self.__gem_name, "9.9.9"])

        if any(self.__gitref.changes):
            # returns a tuple (status, log)
            _build = self.__bitbakeref.build(self.recipename)
            if not _build[0]:
                # file a ticket
                self.__githubref.create_ticket(
                    self.fail_message, _build[1], ["package update"])
                # revert the changes
                self.__gitref.revert(self.__gitref.changes)
                print("FAILED")
                return []
            else:
                # look for new recipes
                self.__get_new_recipes()
                # commit
                _summary, _body = self.update_message
                self.__gitref.commit(self.__gitref.changes, _summary, _body)
                print("PASSED")
                return [self.update_message]
        print("SKIPPED")
        return []


class Gems():

    def __init__(self, repo_path, git, bitbake, github, pkggroup, search_path="recipes-rubygems"):
        self.__repo = repo_path
        self.__search_path = search_path
        self.__gitref = git
        self.__bitbakeref = bitbake
        self.__githubref = github
        self.__pkggroup = pkggroup
        self.__gems = []

        self.__populates_gems()

    def __populates_gems(self):
        for _file in glob.glob(os.path.join(self.__repo, self.__search_path, "*.bb")):
            self.__gems.append(
                Gem(_file, self.__gitref, self.__bitbakeref, self.__githubref, self.__pkggroup))

    def __create_changelog(self, changes):
        return "\n".join("* {}".format(c[0]) for c in changes)

    @property
    def gems(self):
        return self.__gems

    def build(self):
        __map = {k.recipename: (0, k) for k in self.__gems}
        for gem in self.__gems:
            for dep in gem.dependant_recipes:
                try:
                    __map[dep] = (__map[dep][0] + 1, __map[dep][1])
                except KeyError:
                    pass

        _updated_gems = []

        for gem in [v for _, v in sorted(__map.items(), key=lambda item: item[1][0], reverse=True)]:
            _updated_gems += gem[1].attempt_update(self.__repo)

        # finally build the whole image
        _build = self.__bitbakeref.build()
        if not _build[0]:
            # file a ticket
            self.__githubref.create_ticket(
                "package bot: failed package update", _build[1], ["package update"])
            return

        # publish branch
        self.__gitref.publish()
        # create pull request
        self.__githubref.create_pullrequest(
            self.__gitref.branch, "Package update", self.__create_changelog(_updated_gems))
