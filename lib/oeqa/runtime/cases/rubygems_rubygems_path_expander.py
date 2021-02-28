from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_path_expander(RubyGemsTestUtils):

    def test_gem_list_rubygems_path_expander(self):
        self.gem_is_installed("path_expander")

    def test_load_path_expander(self):
        self.gem_is_loadable("path_expander")

