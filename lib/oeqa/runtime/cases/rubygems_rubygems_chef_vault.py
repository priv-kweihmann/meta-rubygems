from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_chef_vault(RubyGemsTestUtils):

    def test_exec_chef_vault(self):
        self.gem_exec_wrapper("chef-vault")

    def test_gem_list_rubygems_chef_vault(self):
        self.gem_is_installed("chef-vault")

    def test_load_chef_vault(self):
        self.gem_is_loadable("chef-vault")

