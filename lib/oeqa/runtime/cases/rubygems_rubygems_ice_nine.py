from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_ice_nine(RubyGemsTestUtils):

    def test_gem_list_rubygems_ice_nine(self):
        self.gem_is_installed("ice_nine")

    def test_load_ice_nine(self):
        self.gem_is_loadable("ice_nine")

