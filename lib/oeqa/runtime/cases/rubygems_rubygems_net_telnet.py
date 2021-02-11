from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_net_telnet(RubyGemsTestUtils):

    def test_gem_list_rubygems_net_telnet(self):
        self.gem_is_installed("net-telnet")

    def test_load_net_telnet(self):
        self.gem_is_loadable("net-telnet")

