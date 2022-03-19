from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_options(RubyGemsTestUtils):

    def test_gem_list_rubygems_options(self):
        self.gem_is_installed("options")

    def test_load_options(self):
        self.gem_is_loadable("options")

