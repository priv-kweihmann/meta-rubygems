from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_faraday_middleware(RubyGemsTestUtils):

    def test_gem_list_rubygems_faraday_middleware(self):
        self.gem_is_installed("faraday_middleware")

    def test_load_faraday_middleware(self):
        self.gem_is_loadable("faraday_middleware")

