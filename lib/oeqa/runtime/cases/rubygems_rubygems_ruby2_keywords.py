from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_ruby2_keywords(RubyGemsTestUtils):

    def test_gem_list_rubygems_ruby2_keywords(self):
        self.gem_is_installed("ruby2_keywords")

    def test_load_ruby2_keywords(self):
        self.gem_is_loadable("ruby2_keywords")

