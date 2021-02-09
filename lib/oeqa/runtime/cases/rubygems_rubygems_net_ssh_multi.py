from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_net_ssh_multi(RubyGemsTestUtils):

    def test_gem_list_rubygems_net_ssh_multi(self):
        self.gem_is_installed("net-ssh-multi")

