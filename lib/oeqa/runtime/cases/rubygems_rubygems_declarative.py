from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_declarative(RubyGemsTestUtils):

    def test_gem_list_rubygems_declarative(self):
        self.gem_is_installed("declarative")

    def test_load_declarative(self):
        self.gem_is_loadable("declarative")

