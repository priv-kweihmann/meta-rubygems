from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_i18n(RubyGemsTestUtils):

    def test_gem_list_rubygems_i18n(self):
        self.gem_is_installed("i18n")

    def test_load_i18n(self):
        self.gem_is_loadable("i18n")

