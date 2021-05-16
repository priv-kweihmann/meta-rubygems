from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_jekyll_sass_converter(RubyGemsTestUtils):

    def test_gem_list_rubygems_jekyll_sass_converter(self):
        self.gem_is_installed("jekyll-sass-converter")

    def test_load_jekyll_sass_converter(self):
        self.gem_is_loadable("jekyll-sass-converter")

