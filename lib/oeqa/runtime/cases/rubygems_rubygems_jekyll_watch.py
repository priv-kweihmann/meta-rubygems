from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_jekyll_watch(RubyGemsTestUtils):

    def test_gem_list_rubygems_jekyll_watch(self):
        self.gem_is_installed("jekyll-watch")

    def test_load_jekyll_watch(self):
        self.gem_is_loadable("jekyll-watch")

