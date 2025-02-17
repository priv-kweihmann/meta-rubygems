from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_chef_winrm_fs(RubyGemsTestUtils):

    def test_exec_chef_rwinrmcp(self):
        self.gem_exec_wrapper("chef-rwinrmcp")

    def test_gem_list_rubygems_chef_winrm_fs(self):
        self.gem_is_installed("chef-winrm-fs")

    def test_load_chef_winrm_fs(self):
        self.gem_is_loadable("chef-winrm-fs")

