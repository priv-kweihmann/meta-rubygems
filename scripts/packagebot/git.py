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
        return self.__repo.rev_parse("origin/{}".format(self.branch))

    def __relative_paths(self, _list):
        _sanitized_changes = set()
        for c in _list:
            if os.path.isabs(c):
                c = os.path.relpath(c, self.__root_path)
            if not c or c == "/":
                continue
            _sanitized_changes.add(c)
        return _sanitized_changes

    def commit(self, changes, summary, body):
        self.__repo.git.add("*")
        self.__repo.index.commit("{}\n\n{}".format(
            summary, body), author=self.__user, committer=self.__user)

    def revert(self, changes):
        self.__repo.git.checkout('-f')
        self.__repo.git.clean('-xfd')

    def create_branch(self, name):
        if name not in self.__repo.branches:
            self.__repo.git.branch(name)
        self.__repo.git.checkout(name)

    def publish(self):
        self.__repo.git.push('origin', self.branch)
