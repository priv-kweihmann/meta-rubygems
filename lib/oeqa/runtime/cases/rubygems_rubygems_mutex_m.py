from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_mutex_m(RubyGemsTestUtils):

    def test_gem_list_rubygems_mutex_m(self):
        self.gem_is_installed("mutex_m")

    def test_load_mutex_m(self):
        self.gem_is_loadable("mutex_m")

