from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_simplecov_html(RubyGemsTestUtils):

    def test_gem_list_rubygems_simplecov_html(self):
        self.gem_is_installed("simplecov-html")

    def test_load_simplecov_html(self):
        self.gem_is_loadable("simplecov-html")

