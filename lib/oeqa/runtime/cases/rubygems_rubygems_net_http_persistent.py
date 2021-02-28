from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_net_http_persistent(RubyGemsTestUtils):

    def test_gem_list_rubygems_net_http_persistent(self):
        self.gem_is_installed("net-http-persistent")

