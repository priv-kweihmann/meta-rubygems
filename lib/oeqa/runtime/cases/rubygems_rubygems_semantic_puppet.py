from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_semantic_puppet(RubyGemsTestUtils):

    def test_gem_list_rubygems_semantic_puppet(self):
        self.gem_is_installed("semantic_puppet")

    def test_load_semantic_puppet(self):
        self.gem_is_loadable("semantic_puppet")

