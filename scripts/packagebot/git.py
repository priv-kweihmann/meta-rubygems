# SPDX-License-Identifier: MIT
# Copyright (c) 2021, Konrad Weihmann

import os

import git


class Git():

    def __init__(self, repo_root, user, mail):
        self.__repo = git.Repo(path=repo_root)
        self.__user = git.Actor(user, mail)
        self.__root_path = repo_root
        self.__changes = set()

        self.__get_repo_changes()

    def __get_repo_changes(self):
        _changes = self.__repo.git.status("--porcelain")
        self.__changes = set(x.strip().split(" ")[1]
                             for x in _changes.split("\n") if " " in x)

    @property
    def root(self):
        return self.__root_path

    @property
    def branch(self):
        return self.__repo.active_branch.name

    @property
    def changes(self):
        self.__get_repo_changes()
        return self.__changes

    @property
    def newfiles(self):
        _changes = self.__repo.git.status("--porcelain")
        return set(x.strip().split(" ")[1] for x in _changes.split("\n") if " " in x and x.startswith("??"))

    @property
    def current_revision(self):
        return self.__repo.git.log("-1", "--pretty=format:%H")

    @property
    def upstream_head(self):
        _branch = self.branch
        if '/' not in _branch:
            _branch = "origin/" + self.branch
        return self.__repo.rev_parse(_branch)

    def upstream_head_branch(self, branch):
        _branch = branch
        if '/' not in branch:
            _branch = "origin/" + branch
        return self.__repo.rev_parse(_branch)

    def __relative_paths(self, _list):
        _sanitized_changes = set()
        for c in _list:
            if os.path.isabs(c):
                c = os.path.relpath(c, self.__root_path)
            if not c or c == "/":
                continue
            _sanitized_changes.add(c)
        return _sanitized_changes

    def commits_since(self, branch, since):
        return list(self.__repo.iter_commits(branch, since=since))

    def get_fresh_source_commits(self, src, target, mode):
        _src = list(self.__repo.iter_commits(src))
        _dst = list(self.__repo.iter_commits(target))
        _dst = [x.message for x in _dst]

        _res = []

        for _, _commit in enumerate(reversed(_src)):
            if mode == "all":
                _res.append(_commit)
            else:
                if _commit.message in _dst:
                    _res = reversed(list(self.__repo.iter_commits(
                        "{}..{}".format(_commit.hexsha, self.upstream_head_branch(src)))))
                    break
        return _res

    def log(self, add_opt=[]):
        return self.__repo.git.execute(["git", "log"] + add_opt)

    def commit(self, changes, summary, body):
        self.__repo.git.add("*")
        self.__repo.index.commit("{}\n\n{}".format(
            summary, body), author=self.__user, committer=self.__user)

    def cherrypick(self, commit):
        try:
            self.__repo.git.execute(["git", "cherry-pick", commit.hexsha])
            return [commit]
        except git.exc.GitCommandError as e:
            _log = self.log(['--first-parent', '--oneline', '-5'])
            print("Skipping '{}' due to conflict :: {} :: {}".format(commit.summary, _log, e))
            self.__repo.git.execute(["git", "cherry-pick", "--abort"])
            return []

    def revert(self, changes):
        self.__repo.git.checkout('-f')
        self.__repo.git.clean('-xfd')

    def create_branch(self, name, from_branch="master", checkout=True):
        if name not in self.__repo.branches:
            self.__repo.git.branch(name, from_branch)
        if checkout:
            self.__repo.git.checkout(name)

    def checkout(self, name):
        self.__repo.git.checkout(name)

    def publish(self, branch=None, target='origin'):
        self.__repo.git.push(target, branch or self.branch)
