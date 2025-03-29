from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_websocket_driver(RubyGemsTestUtils):

    def test_gem_list_rubygems_websocket_driver(self):
        self.gem_is_installed("websocket-driver")

