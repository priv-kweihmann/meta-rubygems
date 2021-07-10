from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_faraday_patron(RubyGemsTestUtils):

    def test_gem_list_rubygems_faraday_patron(self):
        self.gem_is_installed("faraday-patron")

