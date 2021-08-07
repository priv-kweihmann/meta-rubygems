from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_faraday_rack(RubyGemsTestUtils):

    def test_gem_list_rubygems_faraday_rack(self):
        self.gem_is_installed("faraday-rack")

