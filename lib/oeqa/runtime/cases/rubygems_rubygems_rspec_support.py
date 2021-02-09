from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_rspec_support(RubyGemsTestUtils):

    def test_gem_list_rubygems_rspec_support(self):
        self.gem_is_installed("rspec-support")

