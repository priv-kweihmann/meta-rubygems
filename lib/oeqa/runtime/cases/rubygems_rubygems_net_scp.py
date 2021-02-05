from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_net_scp(RubyGemsTestUtils):

    def test_gem_list_rubygems_net_scp(self):
        self.gem_is_installed("net-scp")

