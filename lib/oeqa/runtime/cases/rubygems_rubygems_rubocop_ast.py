from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_rubocop_ast(RubyGemsTestUtils):

    def test_gem_list_rubygems_rubocop_ast(self):
        self.gem_is_installed("rubocop-ast")

    def test_load_rubocop_ast(self):
        self.gem_is_loadable("rubocop-ast")

