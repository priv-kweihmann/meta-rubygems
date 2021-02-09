from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_multi_json(RubyGemsTestUtils):

    def test_gem_list_rubygems_multi_json(self):
        self.gem_is_installed("multi_json")

    def test_load_multi_json(self):
        self.gem_is_loadable("multi_json")

