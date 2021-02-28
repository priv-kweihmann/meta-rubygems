from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_unf(RubyGemsTestUtils):

    def test_gem_list_rubygems_unf(self):
        self.gem_is_installed("unf")

    def test_load_unf(self):
        self.gem_is_loadable("unf")

