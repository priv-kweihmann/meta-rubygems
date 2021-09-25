from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_vault(RubyGemsTestUtils):

    def test_gem_list_rubygems_vault(self):
        self.gem_is_installed("vault")

    def test_load_vault(self):
        self.gem_is_loadable("vault")

