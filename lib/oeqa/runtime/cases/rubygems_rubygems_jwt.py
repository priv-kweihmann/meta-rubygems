from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_jwt(RubyGemsTestUtils):

    def test_gem_list_rubygems_jwt(self):
        self.gem_is_installed("jwt")

    def test_load_jwt(self):
        self.gem_is_loadable("jwt")

