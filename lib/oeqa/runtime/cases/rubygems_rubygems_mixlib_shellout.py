from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_mixlib_shellout(RubyGemsTestUtils):

    def test_gem_list_rubygems_mixlib_shellout(self):
        self.gem_is_installed("mixlib-shellout")

