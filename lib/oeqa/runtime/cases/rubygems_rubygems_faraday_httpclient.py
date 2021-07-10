from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_faraday_httpclient(RubyGemsTestUtils):

    def test_gem_list_rubygems_faraday_httpclient(self):
        self.gem_is_installed("faraday-httpclient")

