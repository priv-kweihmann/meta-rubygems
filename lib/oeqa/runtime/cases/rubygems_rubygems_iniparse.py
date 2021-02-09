from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_iniparse(RubyGemsTestUtils):

    def test_gem_list_rubygems_iniparse(self):
        self.gem_is_installed("iniparse")

    def test_load_iniparse(self):
        self.gem_is_loadable("iniparse")

