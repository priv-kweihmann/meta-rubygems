from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_faraday_excon(RubyGemsTestUtils):

    def test_gem_list_rubygems_faraday_excon(self):
        self.gem_is_installed("faraday-excon")

