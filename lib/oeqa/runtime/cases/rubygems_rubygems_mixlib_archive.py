from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_mixlib_archive(RubyGemsTestUtils):

    def test_gem_list_rubygems_mixlib_archive(self):
        self.gem_is_installed("mixlib-archive")

