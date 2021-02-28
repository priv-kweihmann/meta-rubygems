from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_http_cookie(RubyGemsTestUtils):

    def test_gem_list_rubygems_http_cookie(self):
        self.gem_is_installed("http-cookie")

    def test_load_http_cookie(self):
        self.gem_is_loadable("http-cookie")

