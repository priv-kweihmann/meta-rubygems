from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_net_ssh_gateway(RubyGemsTestUtils):

    def test_gem_list_rubygems_net_ssh_gateway(self):
        self.gem_is_installed("net-ssh-gateway")

