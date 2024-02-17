from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_em_http_request(RubyGemsTestUtils):

    def test_gem_list_rubygems_em_http_request(self):
        self.gem_is_installed("em-http-request")

    def test_load_em_http(self):
        self.gem_is_loadable("em-http")

    def test_load_em_http_request(self):
        self.gem_is_loadable("em-http-request")

