from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_time(RubyGemsTestUtils):

    def test_gem_list_rubygems_time(self):
        self.gem_is_installed("time")

    def test_load_time(self):
        self.gem_is_loadable("time")

