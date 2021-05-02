from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_chef(RubyGemsTestUtils):

    def test_gem_list_rubygems_chef(self):
        self.gem_is_installed("chef")

    def test_load_chef(self):
        self.gem_is_loadable("chef")

