from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_bson(RubyGemsTestUtils):

    def test_gem_list_rubygems_bson(self):
        self.gem_is_installed("bson")

    def test_load_bson(self):
        self.gem_is_loadable("bson")

