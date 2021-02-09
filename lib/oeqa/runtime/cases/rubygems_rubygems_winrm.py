from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_winrm(RubyGemsTestUtils):

    def test_exec_rwinrm(self):
        self.gem_exec_wrapper("rwinrm")

    def test_gem_list_rubygems_winrm(self):
        self.gem_is_installed("winrm")

    def test_load_winrm(self):
        self.gem_is_loadable("winrm")

