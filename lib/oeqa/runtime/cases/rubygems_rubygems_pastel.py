from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_pastel(RubyGemsTestUtils):

    def test_gem_list_rubygems_pastel(self):
        self.gem_is_installed("pastel")

    def test_load_pastel(self):
        self.gem_is_loadable("pastel")

