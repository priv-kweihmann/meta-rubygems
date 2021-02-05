from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_chef_config(RubyGemsTestUtils):

    def test_gem_list_rubygems_chef_config(self):
        self.gem_is_installed("chef-config")

    def test_load_chef_config(self):
        self.gem_is_loadable("chef-config")

