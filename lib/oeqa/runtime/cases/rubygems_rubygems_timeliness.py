from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_timeliness(RubyGemsTestUtils):

    def test_gem_list_rubygems_timeliness(self):
        self.gem_is_installed("timeliness")

    def test_load_timeliness(self):
        self.gem_is_loadable("timeliness")

