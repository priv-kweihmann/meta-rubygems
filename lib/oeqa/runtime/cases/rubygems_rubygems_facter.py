from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_facter(RubyGemsTestUtils):

    def test_exec_facter(self):
        self.gem_exec_wrapper("facter")

    def test_gem_list_rubygems_facter(self):
        self.gem_is_installed("facter")

    def test_load_facter(self):
        self.gem_is_loadable("facter")

