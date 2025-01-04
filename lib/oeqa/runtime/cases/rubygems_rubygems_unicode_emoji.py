from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_unicode_emoji(RubyGemsTestUtils):

    def test_gem_list_rubygems_unicode_emoji(self):
        self.gem_is_installed("unicode-emoji")

