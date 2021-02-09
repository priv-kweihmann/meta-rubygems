from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_json(RubyGemsTestUtils):

    def test_gem_list_rubygems_json(self):
        self.gem_is_installed("json")

    def test_load_json(self):
        self.gem_is_loadable("json")

