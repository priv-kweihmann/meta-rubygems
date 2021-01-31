from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_thor(RubyGemsTestUtils):

    def test_gem_list_rubygems_thor(self):
        self.gem_is_installed("thor")

    def test_load_thor(self):
        self.gem_is_loadable("thor")

