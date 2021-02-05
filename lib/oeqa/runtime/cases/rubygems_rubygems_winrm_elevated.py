from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_winrm_elevated(RubyGemsTestUtils):

    def test_gem_list_rubygems_winrm_elevated(self):
        self.gem_is_installed("winrm-elevated")

    def test_load_winrm_elevated(self):
        self.gem_is_loadable("winrm-elevated")

