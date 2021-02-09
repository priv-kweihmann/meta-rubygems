from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_mixlib_log(RubyGemsTestUtils):

    def test_gem_list_rubygems_mixlib_log(self):
        self.gem_is_installed("mixlib-log")

