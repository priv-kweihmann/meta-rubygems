from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_inspec(RubyGemsTestUtils):

    def test_gem_list_rubygems_inspec(self):
        self.gem_is_installed("inspec")

