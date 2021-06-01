from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_net_protocol(RubyGemsTestUtils):

    def test_gem_list_rubygems_net_protocol(self):
        self.gem_is_installed("net-protocol")

