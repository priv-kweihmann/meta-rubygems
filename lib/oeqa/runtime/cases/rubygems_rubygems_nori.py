from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_nori(RubyGemsTestUtils):

    def test_gem_list_rubygems_nori(self):
        self.gem_is_installed("nori")

    def test_load_nori(self):
        self.gem_is_loadable("nori")

