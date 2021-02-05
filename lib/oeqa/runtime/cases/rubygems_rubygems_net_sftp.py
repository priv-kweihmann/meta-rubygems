from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_net_sftp(RubyGemsTestUtils):

    def test_gem_list_rubygems_net_sftp(self):
        self.gem_is_installed("net-sftp")

