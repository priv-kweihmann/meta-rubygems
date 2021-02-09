from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_rspec_its(RubyGemsTestUtils):

    def test_gem_list_rubygems_rspec_its(self):
        self.gem_is_installed("rspec-its")

