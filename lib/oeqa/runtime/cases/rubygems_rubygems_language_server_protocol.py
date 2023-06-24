from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_language_server_protocol(RubyGemsTestUtils):

    def test_gem_list_rubygems_language_server_protocol(self):
        self.gem_is_installed("language_server-protocol")

    def test_load_language_server_protocol(self):
        self.gem_is_loadable("language_server-protocol")

