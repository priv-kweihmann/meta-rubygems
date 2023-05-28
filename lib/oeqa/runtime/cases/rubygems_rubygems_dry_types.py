from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_dry_types(RubyGemsTestUtils):

    def test_gem_list_rubygems_dry_types(self):
        self.gem_is_installed("dry-types")

    def test_load_dry_types(self):
        self.gem_is_loadable("dry-types")

