from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_rainbow(RubyGemsTestUtils):

    def test_gem_list_rubygems_rainbow(self):
        self.gem_is_installed("rainbow")

    def test_load_rainbow(self):
        self.gem_is_loadable("rainbow")

