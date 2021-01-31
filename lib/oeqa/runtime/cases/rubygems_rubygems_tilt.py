from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_tilt(RubyGemsTestUtils):

    def test_gem_list_rubygems_tilt(self):
        self.gem_is_installed("tilt")

    def test_load_tilt(self):
        self.gem_is_loadable("tilt")

