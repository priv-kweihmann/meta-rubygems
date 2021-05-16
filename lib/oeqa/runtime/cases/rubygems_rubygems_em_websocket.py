from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_em_websocket(RubyGemsTestUtils):

    def test_gem_list_rubygems_em_websocket(self):
        self.gem_is_installed("em-websocket")

    def test_load_em_websocket(self):
        self.gem_is_loadable("em-websocket")

