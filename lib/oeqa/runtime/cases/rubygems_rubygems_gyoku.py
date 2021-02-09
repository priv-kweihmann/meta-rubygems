from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_gyoku(RubyGemsTestUtils):

    def test_gem_list_rubygems_gyoku(self):
        self.gem_is_installed("gyoku")

    def test_load_gyoku(self):
        self.gem_is_loadable("gyoku")

