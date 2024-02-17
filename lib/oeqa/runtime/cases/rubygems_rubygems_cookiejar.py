from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_cookiejar(RubyGemsTestUtils):

    def test_gem_list_rubygems_cookiejar(self):
        self.gem_is_installed("cookiejar")

    def test_load_cookiejar(self):
        self.gem_is_loadable("cookiejar")

