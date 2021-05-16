from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_colorator(RubyGemsTestUtils):

    def test_gem_list_rubygems_colorator(self):
        self.gem_is_installed("colorator")

    def test_load_colorator(self):
        self.gem_is_loadable("colorator")

