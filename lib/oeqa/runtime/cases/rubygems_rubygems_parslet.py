from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_parslet(RubyGemsTestUtils):

    def test_gem_list_rubygems_parslet(self):
        self.gem_is_installed("parslet")

    def test_load_parslet(self):
        self.gem_is_loadable("parslet")

