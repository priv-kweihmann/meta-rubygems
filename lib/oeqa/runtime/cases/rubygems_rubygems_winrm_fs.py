from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_winrm_fs(RubyGemsTestUtils):

    def test_exec_rwinrmcp(self):
        self.gem_exec_wrapper("rwinrmcp")

    def test_gem_list_rubygems_winrm_fs(self):
        self.gem_is_installed("winrm-fs")

    def test_load_winrm_fs(self):
        self.gem_is_loadable("winrm-fs")

