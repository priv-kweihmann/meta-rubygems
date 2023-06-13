from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_pry_coolline(RubyGemsTestUtils):

    def test_gem_list_rubygems_pry_coolline(self):
        self.gem_is_installed("pry-coolline")

    def test_load_pry_coolline(self):
        self.gem_is_loadable("pry-coolline")

