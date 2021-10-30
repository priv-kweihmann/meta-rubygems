from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_cookstyle(RubyGemsTestUtils):

    def test_exec_cookstyle(self):
        self.gem_exec_wrapper("cookstyle")

    def test_gem_list_rubygems_cookstyle(self):
        self.gem_is_installed("cookstyle")

    def test_load_cookstyle(self):
        self.gem_is_loadable("cookstyle")

