from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_fast_gettext(RubyGemsTestUtils):

    def test_gem_list_rubygems_fast_gettext(self):
        self.gem_is_installed("fast_gettext")

    def test_load_fast_gettext(self):
        self.gem_is_loadable("fast_gettext")

