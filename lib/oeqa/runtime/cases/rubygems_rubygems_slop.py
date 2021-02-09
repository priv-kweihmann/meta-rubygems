from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_slop(RubyGemsTestUtils):

    def test_gem_list_rubygems_slop(self):
        self.gem_is_installed("slop")

    def test_load_slop(self):
        self.gem_is_loadable("slop")

