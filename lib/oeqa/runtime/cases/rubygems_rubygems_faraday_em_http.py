from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_faraday_em_http(RubyGemsTestUtils):

    def test_gem_list_rubygems_faraday_em_http(self):
        self.gem_is_installed("faraday-em_http")

