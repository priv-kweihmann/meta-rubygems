from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_dry_configurable(RubyGemsTestUtils):

    def test_gem_list_rubygems_dry_configurable(self):
        self.gem_is_installed("dry-configurable")

    def test_load_dry_configurable(self):
        self.gem_is_loadable("dry-configurable")

