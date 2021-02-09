from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_net_netconf(RubyGemsTestUtils):

    def test_gem_list_rubygems_net_netconf(self):
        self.gem_is_installed("net-netconf")

