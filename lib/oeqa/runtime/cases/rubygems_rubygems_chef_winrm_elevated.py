from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_chef_winrm_elevated(RubyGemsTestUtils):

    def test_gem_list_rubygems_chef_winrm_elevated(self):
        self.gem_is_installed("chef-winrm-elevated")

    def test_load_chef_winrm_elevated(self):
        self.gem_is_loadable("chef-winrm-elevated")

