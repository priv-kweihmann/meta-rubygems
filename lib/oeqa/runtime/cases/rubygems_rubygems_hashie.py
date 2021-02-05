from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_hashie(RubyGemsTestUtils):

    def test_gem_list_rubygems_hashie(self):
        self.gem_is_installed("hashie")

    def test_load_hashie(self):
        self.gem_is_loadable("hashie")

