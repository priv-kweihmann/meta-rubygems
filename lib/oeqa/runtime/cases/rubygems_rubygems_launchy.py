from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_launchy(RubyGemsTestUtils):

    def test_exec_launchy(self):
        self.gem_exec_wrapper("launchy")

    def test_gem_list_rubygems_launchy(self):
        self.gem_is_installed("launchy")

    def test_load_launchy(self):
        self.gem_is_loadable("launchy")

