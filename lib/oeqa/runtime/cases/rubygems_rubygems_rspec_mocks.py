from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_rspec_mocks(RubyGemsTestUtils):

    def test_gem_list_rubygems_rspec_mocks(self):
        self.gem_is_installed("rspec-mocks")

