from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_rspec_expectations(RubyGemsTestUtils):

    def test_gem_list_rubygems_rspec_expectations(self):
        self.gem_is_installed("rspec-expectations")

