from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_kramdown_parser_gfm(RubyGemsTestUtils):

    def test_gem_list_rubygems_kramdown_parser_gfm(self):
        self.gem_is_installed("kramdown-parser-gfm")

    def test_load_kramdown_parser_gfm(self):
        self.gem_is_loadable("kramdown-parser-gfm")

