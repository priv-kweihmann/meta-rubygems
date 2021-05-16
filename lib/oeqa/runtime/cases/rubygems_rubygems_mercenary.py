from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_mercenary(RubyGemsTestUtils):

    def test_gem_list_rubygems_mercenary(self):
        self.gem_is_installed("mercenary")

    def test_load_mercenary(self):
        self.gem_is_loadable("mercenary")

