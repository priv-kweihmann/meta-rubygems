from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_mcp(RubyGemsTestUtils):

    def test_gem_list_rubygems_mcp(self):
        self.gem_is_installed("mcp")

    def test_load_json_rpc_handler(self):
        self.gem_is_loadable("json_rpc_handler")

    def test_load_mcp(self):
        self.gem_is_loadable("mcp")

