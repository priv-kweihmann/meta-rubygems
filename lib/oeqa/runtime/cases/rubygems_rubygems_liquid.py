from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_liquid(RubyGemsTestUtils):

    def test_gem_list_rubygems_liquid(self):
        self.gem_is_installed("liquid")

    def test_load_liquid(self):
        self.gem_is_loadable("liquid")

