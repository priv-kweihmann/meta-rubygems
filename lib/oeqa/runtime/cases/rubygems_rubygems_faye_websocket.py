from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_faye_websocket(RubyGemsTestUtils):

    def test_gem_list_rubygems_faye_websocket(self):
        self.gem_is_installed("faye-websocket")

