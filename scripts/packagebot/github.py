import github3


class GitHub():

    def __init__(self, user, token, repo_user, repo):
        self.__login = github3.login(user, token)
        self.__repouser = repo_user
        self.__repo = self.__login.repository(repo_user, repo)

    def create_ticket(self, summary, body, labels):
        self.__repo.create_issue(title=summary, body=body, labels=labels)

    def create_pullrequest(self, branch, summary, body, target=None):
        self.__repo.create_pull(title=summary, body=body, base=target or self.__repo.default_branch,
                                head="{}:{}".format(self.__repouser, branch))
