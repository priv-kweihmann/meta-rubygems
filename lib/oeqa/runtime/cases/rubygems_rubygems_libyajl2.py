from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_libyajl2(RubyGemsTestUtils):

    def test_gem_list_rubygems_libyajl2(self):
        self.gem_is_installed("libyajl2")

    def test_load_libyajl2(self):
        self.gem_is_loadable("libyajl2")

