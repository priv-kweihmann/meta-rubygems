from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_dry_logic(RubyGemsTestUtils):

    def test_gem_list_rubygems_dry_logic(self):
        self.gem_is_installed("dry-logic")

    def test_load_dry_logic(self):
        self.gem_is_loadable("dry-logic")

