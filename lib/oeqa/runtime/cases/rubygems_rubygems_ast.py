from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_ast(RubyGemsTestUtils):

    def test_gem_list_rubygems_ast(self):
        self.gem_is_installed("ast")

    def test_load_ast(self):
        self.gem_is_loadable("ast")

