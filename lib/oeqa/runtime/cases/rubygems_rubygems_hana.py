from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_hana(RubyGemsTestUtils):

    def test_gem_list_rubygems_hana(self):
        self.gem_is_installed("hana")

    def test_load_hana(self):
        self.gem_is_loadable("hana")

