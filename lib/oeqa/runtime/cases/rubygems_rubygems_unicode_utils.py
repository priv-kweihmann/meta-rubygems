from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_unicode_utils(RubyGemsTestUtils):

    def test_gem_list_rubygems_unicode_utils(self):
        self.gem_is_installed("unicode_utils")

    def test_load_unicode_utils(self):
        self.gem_is_loadable("unicode_utils")

