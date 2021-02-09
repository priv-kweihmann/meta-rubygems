from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_builder(RubyGemsTestUtils):

    def test_gem_list_rubygems_builder(self):
        self.gem_is_installed("builder")

    def test_load_blankslate(self):
        self.gem_is_loadable("blankslate")

    def test_load_builder(self):
        self.gem_is_loadable("builder")

