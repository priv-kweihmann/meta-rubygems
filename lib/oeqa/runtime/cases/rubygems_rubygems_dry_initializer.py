from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_dry_initializer(RubyGemsTestUtils):

    def test_gem_list_rubygems_dry_initializer(self):
        self.gem_is_installed("dry-initializer")

    def test_load_dry_initializer(self):
        self.gem_is_loadable("dry-initializer")

