from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_netrc(RubyGemsTestUtils):

    def test_gem_list_rubygems_netrc(self):
        self.gem_is_installed("netrc")

    def test_load_netrc(self):
        self.gem_is_loadable("netrc")

