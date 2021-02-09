from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_train_winrm(RubyGemsTestUtils):

    def test_gem_list_rubygems_train_winrm(self):
        self.gem_is_installed("train-winrm")

    def test_load_train_winrm(self):
        self.gem_is_loadable("train-winrm")

