from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_plist(RubyGemsTestUtils):

    def test_gem_list_rubygems_plist(self):
        self.gem_is_installed("plist")

    def test_load_plist(self):
        self.gem_is_loadable("plist")

