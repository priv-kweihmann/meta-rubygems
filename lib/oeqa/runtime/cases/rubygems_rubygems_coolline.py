from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_coolline(RubyGemsTestUtils):

    def test_gem_list_rubygems_coolline(self):
        self.gem_is_installed("coolline")

    def test_load_coolline(self):
        self.gem_is_loadable("coolline")

