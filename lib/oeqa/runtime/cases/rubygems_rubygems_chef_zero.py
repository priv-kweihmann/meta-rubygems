from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_chef_zero(RubyGemsTestUtils):

    def test_exec_chef_zero(self):
        self.gem_exec_wrapper("chef-zero")

    def test_gem_list_rubygems_chef_zero(self):
        self.gem_is_installed("chef-zero")

    def test_load_chef_zero(self):
        self.gem_is_loadable("chef_zero")

