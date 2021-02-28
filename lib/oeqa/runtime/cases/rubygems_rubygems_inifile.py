from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_inifile(RubyGemsTestUtils):

    def test_gem_list_rubygems_inifile(self):
        self.gem_is_installed("inifile")

    def test_load_inifile(self):
        self.gem_is_loadable("inifile")

