from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_locale(RubyGemsTestUtils):

    def test_gem_list_rubygems_locale(self):
        self.gem_is_installed("locale")

    def test_load_locale(self):
        self.gem_is_loadable("locale")

