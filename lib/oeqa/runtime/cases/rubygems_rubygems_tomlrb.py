from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_tomlrb(RubyGemsTestUtils):

    def test_gem_list_rubygems_tomlrb(self):
        self.gem_is_installed("tomlrb")

    def test_load_tomlrb(self):
        self.gem_is_loadable("tomlrb")

