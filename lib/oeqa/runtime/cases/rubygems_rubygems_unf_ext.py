from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_unf_ext(RubyGemsTestUtils):

    def test_gem_list_rubygems_unf_ext(self):
        self.gem_is_installed("unf_ext")

    def test_load_unf_ext(self):
        self.gem_is_loadable("unf_ext")

