from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_descendants_tracker(RubyGemsTestUtils):

    def test_gem_list_rubygems_descendants_tracker(self):
        self.gem_is_installed("descendants_tracker")

    def test_load_descendants_tracker(self):
        self.gem_is_loadable("descendants_tracker")

