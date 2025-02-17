from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_chef_winrm(RubyGemsTestUtils):

    def test_exec_chef_rwinrm(self):
        self.gem_exec_wrapper("chef-rwinrm")

    def test_gem_list_rubygems_chef_winrm(self):
        self.gem_is_installed("chef-winrm")

    def test_load_chef_winrm(self):
        self.gem_is_loadable("chef-winrm")

