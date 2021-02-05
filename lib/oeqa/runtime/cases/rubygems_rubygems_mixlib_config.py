from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_mixlib_config(RubyGemsTestUtils):

    def test_gem_list_rubygems_mixlib_config(self):
        self.gem_is_installed("mixlib-config")

