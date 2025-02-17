from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_chef_gyoku(RubyGemsTestUtils):

    def test_gem_list_rubygems_chef_gyoku(self):
        self.gem_is_installed("chef-gyoku")

    def test_load_gyoku(self):
        self.gem_is_loadable("gyoku")

