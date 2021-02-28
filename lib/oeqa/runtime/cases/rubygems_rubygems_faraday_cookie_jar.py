from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_faraday_cookie_jar(RubyGemsTestUtils):

    def test_gem_list_rubygems_faraday_cookie_jar(self):
        self.gem_is_installed("faraday-cookie_jar")

    def test_load_faraday_cookie_jar(self):
        self.gem_is_loadable("faraday-cookie_jar")

