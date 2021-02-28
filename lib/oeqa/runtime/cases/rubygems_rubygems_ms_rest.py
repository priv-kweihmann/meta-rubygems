from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_ms_rest(RubyGemsTestUtils):

    def test_gem_list_rubygems_ms_rest(self):
        self.gem_is_installed("ms_rest")

    def test_load_ms_rest(self):
        self.gem_is_loadable("ms_rest")

