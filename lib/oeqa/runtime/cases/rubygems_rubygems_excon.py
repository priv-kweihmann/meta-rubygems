from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_excon(RubyGemsTestUtils):

    def test_gem_list_rubygems_excon(self):
        self.gem_is_installed("excon")

    def test_load_excon(self):
        self.gem_is_loadable("excon")

