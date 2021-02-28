from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_docker_api(RubyGemsTestUtils):

    def test_gem_list_rubygems_docker_api(self):
        self.gem_is_installed("docker-api")

    def test_load_docker(self):
        self.gem_is_loadable("docker")

    def test_load_docker_api(self):
        self.gem_is_loadable("docker-api")

