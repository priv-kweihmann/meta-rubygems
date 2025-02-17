from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_lint_roller(RubyGemsTestUtils):

    def test_gem_list_rubygems_lint_roller(self):
        self.gem_is_installed("lint_roller")

    def test_load_lint_roller(self):
        self.gem_is_loadable("lint_roller")

