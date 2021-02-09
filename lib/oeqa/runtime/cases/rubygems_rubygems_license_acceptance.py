from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_license_acceptance(RubyGemsTestUtils):

    def test_gem_list_rubygems_license_acceptance(self):
        self.gem_is_installed("license-acceptance")

