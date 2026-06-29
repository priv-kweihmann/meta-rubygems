from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_simpleidn(RubyGemsTestUtils):

    def test_gem_list_rubygems_simpleidn(self):
        self.gem_is_installed("simpleidn")

    def test_load_simpleidn(self):
        self.gem_is_loadable("simpleidn")

