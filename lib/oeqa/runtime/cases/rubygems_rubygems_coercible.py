from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_coercible(RubyGemsTestUtils):

    def test_gem_list_rubygems_coercible(self):
        self.gem_is_installed("coercible")

    def test_load_coercible(self):
        self.gem_is_loadable("coercible")

