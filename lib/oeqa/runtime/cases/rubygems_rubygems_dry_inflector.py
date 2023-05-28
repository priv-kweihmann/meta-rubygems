from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_dry_inflector(RubyGemsTestUtils):

    def test_gem_list_rubygems_dry_inflector(self):
        self.gem_is_installed("dry-inflector")

    def test_load_dry_inflector(self):
        self.gem_is_loadable("dry-inflector")

