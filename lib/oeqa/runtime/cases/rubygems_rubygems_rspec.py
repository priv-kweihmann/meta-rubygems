from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_rspec(RubyGemsTestUtils):

    def test_gem_list_rubygems_rspec(self):
        self.gem_is_installed("rspec")

    def test_load_rspec(self):
        self.gem_is_loadable("rspec")

