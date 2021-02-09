from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_chef_utils(RubyGemsTestUtils):

    def test_gem_list_rubygems_chef_utils(self):
        self.gem_is_installed("chef-utils")

    def test_load_chef_utils(self):
        self.gem_is_loadable("chef-utils")

