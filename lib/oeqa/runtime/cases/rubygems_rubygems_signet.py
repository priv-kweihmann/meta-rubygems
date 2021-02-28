from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_signet(RubyGemsTestUtils):

    def test_gem_list_rubygems_signet(self):
        self.gem_is_installed("signet")

    def test_load_signet(self):
        self.gem_is_loadable("signet")

