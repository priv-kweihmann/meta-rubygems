from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_connection_pool(RubyGemsTestUtils):

    def test_gem_list_rubygems_connection_pool(self):
        self.gem_is_installed("connection_pool")

    def test_load_connection_pool(self):
        self.gem_is_loadable("connection_pool")

