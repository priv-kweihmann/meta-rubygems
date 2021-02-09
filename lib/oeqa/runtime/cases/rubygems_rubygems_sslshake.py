from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_sslshake(RubyGemsTestUtils):

    def test_gem_list_rubygems_sslshake(self):
        self.gem_is_installed("sslshake")

    def test_load_sslshake(self):
        self.gem_is_loadable("sslshake")

