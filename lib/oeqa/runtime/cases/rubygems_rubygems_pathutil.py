from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_pathutil(RubyGemsTestUtils):

    def test_gem_list_rubygems_pathutil(self):
        self.gem_is_installed("pathutil")

    def test_load_pathutil(self):
        self.gem_is_loadable("pathutil")

