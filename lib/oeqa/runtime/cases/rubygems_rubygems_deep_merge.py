from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_deep_merge(RubyGemsTestUtils):

    def test_gem_list_rubygems_deep_merge(self):
        self.gem_is_installed("deep_merge")

    def test_load_deep_merge(self):
        self.gem_is_loadable("deep_merge")

