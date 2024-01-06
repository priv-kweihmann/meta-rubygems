from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_dry_schema(RubyGemsTestUtils):

    def test_gem_list_rubygems_dry_schema(self):
        self.gem_is_installed("dry-schema")

    def test_load_dry_schema(self):
        self.gem_is_loadable("dry-schema")

