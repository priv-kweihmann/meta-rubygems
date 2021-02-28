from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_virtus(RubyGemsTestUtils):

    def test_gem_list_rubygems_virtus(self):
        self.gem_is_installed("virtus")

    def test_load_virtus(self):
        self.gem_is_loadable("virtus")

