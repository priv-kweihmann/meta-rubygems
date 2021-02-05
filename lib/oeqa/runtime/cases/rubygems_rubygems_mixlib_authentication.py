from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_mixlib_authentication(RubyGemsTestUtils):

    def test_gem_list_rubygems_mixlib_authentication(self):
        self.gem_is_installed("mixlib-authentication")

