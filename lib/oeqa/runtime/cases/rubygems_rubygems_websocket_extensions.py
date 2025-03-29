from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_websocket_extensions(RubyGemsTestUtils):

    def test_gem_list_rubygems_websocket_extensions(self):
        self.gem_is_installed("websocket-extensions")

