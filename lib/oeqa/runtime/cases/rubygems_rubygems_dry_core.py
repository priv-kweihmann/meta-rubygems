from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_dry_core(RubyGemsTestUtils):

    def test_gem_list_rubygems_dry_core(self):
        self.gem_is_installed("dry-core")

    def test_load_dry_core(self):
        self.gem_is_loadable("dry-core")

