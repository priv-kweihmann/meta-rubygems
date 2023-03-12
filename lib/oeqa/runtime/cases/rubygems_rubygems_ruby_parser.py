from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_ruby_parser(RubyGemsTestUtils):

    def test_exec_ruby_parse(self):
        self.gem_exec_wrapper("ruby_parse")

    def test_exec_ruby_parse_extract_error(self):
        self.gem_exec_wrapper("ruby_parse_extract_error")

    def test_gem_list_rubygems_ruby_parser(self):
        self.gem_is_installed("ruby_parser")

    def test_load_rp_extensions(self):
        self.gem_is_loadable("rp_extensions")

    def test_load_rp_stringscanner(self):
        self.gem_is_loadable("rp_stringscanner")

    def test_load_ruby20_parser(self):
        self.gem_is_loadable("ruby20_parser")

    def test_load_ruby21_parser(self):
        self.gem_is_loadable("ruby21_parser")

    def test_load_ruby22_parser(self):
        self.gem_is_loadable("ruby22_parser")

    def test_load_ruby23_parser(self):
        self.gem_is_loadable("ruby23_parser")

    def test_load_ruby24_parser(self):
        self.gem_is_loadable("ruby24_parser")

    def test_load_ruby25_parser(self):
        self.gem_is_loadable("ruby25_parser")

    def test_load_ruby26_parser(self):
        self.gem_is_loadable("ruby26_parser")

    def test_load_ruby27_parser(self):
        self.gem_is_loadable("ruby27_parser")

    def test_load_ruby30_parser(self):
        self.gem_is_loadable("ruby30_parser")

    def test_load_ruby31_parser(self):
        self.gem_is_loadable("ruby31_parser")

    def test_load_ruby32_parser(self):
        self.gem_is_loadable("ruby32_parser")

    def test_load_ruby_lexer(self):
        self.gem_is_loadable("ruby_lexer")

    def test_load_ruby_lexer_rex(self):
        self.gem_is_loadable("ruby_lexer.rex")

    def test_load_ruby_lexer_strings(self):
        self.gem_is_loadable("ruby_lexer_strings")

    def test_load_ruby_parser(self):
        self.gem_is_loadable("ruby_parser")

    def test_load_ruby_parser_extras(self):
        self.gem_is_loadable("ruby_parser_extras")

