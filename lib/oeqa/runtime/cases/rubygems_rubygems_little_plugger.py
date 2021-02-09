from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_little_plugger(RubyGemsTestUtils):

    def test_gem_list_rubygems_little_plugger(self):
        self.gem_is_installed("little-plugger")

    def test_load_little_plugger(self):
        self.gem_is_loadable("little-plugger")

