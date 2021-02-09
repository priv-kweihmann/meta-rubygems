from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_net_ssh(RubyGemsTestUtils):

    def test_gem_list_rubygems_net_ssh(self):
        self.gem_is_installed("net-ssh")

