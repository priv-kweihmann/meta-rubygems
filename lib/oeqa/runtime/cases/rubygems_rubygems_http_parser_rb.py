from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_http_parser_rb(RubyGemsTestUtils):

    def test_gem_list_rubygems_http_parser_rb(self):
        self.gem_is_installed("http_parser.rb")

    def test_load_http_parser(self):
        self.gem_is_loadable("http_parser")

