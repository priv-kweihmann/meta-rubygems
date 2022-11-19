from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_rest_client(RubyGemsTestUtils):

    def test_exec_restclient(self):
        self.gem_exec_wrapper("restclient")

    def test_gem_list_rubygems_rest_client(self):
        self.gem_is_installed("rest-client")

    def test_load_rest_client(self):
        self.gem_is_loadable("rest-client")

    def test_load_rest_client(self):
        self.gem_is_loadable("rest_client")

    def test_load_restclient(self):
        self.gem_is_loadable("restclient")

