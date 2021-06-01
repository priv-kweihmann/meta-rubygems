from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_net_ftp(RubyGemsTestUtils):

    def test_gem_list_rubygems_net_ftp(self):
        self.gem_is_installed("net-ftp")

