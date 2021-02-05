from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_mixlib_cli(RubyGemsTestUtils):

    def test_gem_list_rubygems_mixlib_cli(self):
        self.gem_is_installed("mixlib-cli")

