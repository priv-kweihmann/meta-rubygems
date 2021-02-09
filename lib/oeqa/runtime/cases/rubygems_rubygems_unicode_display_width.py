from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_unicode_display_width(RubyGemsTestUtils):

    def test_gem_list_rubygems_unicode_display_width(self):
        self.gem_is_installed("unicode-display_width")

