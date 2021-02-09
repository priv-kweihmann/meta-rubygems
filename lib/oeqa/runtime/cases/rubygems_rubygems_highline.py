from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_highline(RubyGemsTestUtils):

    def test_gem_list_rubygems_highline(self):
        self.gem_is_installed("highline")

    def test_load_highline(self):
        self.gem_is_loadable("highline")

