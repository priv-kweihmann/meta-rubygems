from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_googleauth(RubyGemsTestUtils):

    def test_gem_list_rubygems_googleauth(self):
        self.gem_is_installed("googleauth")

    def test_load_googleauth(self):
        self.gem_is_loadable("googleauth")

