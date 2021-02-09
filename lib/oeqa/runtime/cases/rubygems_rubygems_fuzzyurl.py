from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_fuzzyurl(RubyGemsTestUtils):

    def test_gem_list_rubygems_fuzzyurl(self):
        self.gem_is_installed("fuzzyurl")

    def test_load_fuzzyurl(self):
        self.gem_is_loadable("fuzzyurl")

