from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_public_suffix(RubyGemsTestUtils):

    def test_gem_list_rubygems_public_suffix(self):
        self.gem_is_installed("public_suffix")

    def test_load_public_suffix(self):
        self.gem_is_loadable("public_suffix")

