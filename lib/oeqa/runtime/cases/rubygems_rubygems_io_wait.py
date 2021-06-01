from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_io_wait(RubyGemsTestUtils):

    def test_gem_list_rubygems_io_wait(self):
        self.gem_is_installed("io-wait")

