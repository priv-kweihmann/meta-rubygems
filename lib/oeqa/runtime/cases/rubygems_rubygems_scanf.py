from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_scanf(RubyGemsTestUtils):

    def test_gem_list_rubygems_scanf(self):
        self.gem_is_installed("scanf")

    def test_load_scanf(self):
        self.gem_is_loadable("scanf")

