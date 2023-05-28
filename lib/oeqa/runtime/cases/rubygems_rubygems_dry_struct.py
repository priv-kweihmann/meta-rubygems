from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_dry_struct(RubyGemsTestUtils):

    def test_gem_list_rubygems_dry_struct(self):
        self.gem_is_installed("dry-struct")

    def test_load_dry_struct(self):
        self.gem_is_loadable("dry-struct")

