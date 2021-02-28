from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_simplecov(RubyGemsTestUtils):

    def test_gem_list_rubygems_simplecov(self):
        self.gem_is_installed("simplecov")

    def test_load_simplecov(self):
        self.gem_is_loadable("simplecov")

