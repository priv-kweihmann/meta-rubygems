from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_httpclient(RubyGemsTestUtils):

    def test_exec_httpclient(self):
        self.gem_exec_wrapper("httpclient")

    def test_gem_list_rubygems_httpclient(self):
        self.gem_is_installed("httpclient")

    def test_load_hexdump(self):
        self.gem_is_loadable("hexdump")

    def test_load_http_access2(self):
        self.gem_is_loadable("http-access2")

    def test_load_httpclient(self):
        self.gem_is_loadable("httpclient")

    def test_load_jsonclient(self):
        self.gem_is_loadable("jsonclient")

    def test_load_oauthclient(self):
        self.gem_is_loadable("oauthclient")

