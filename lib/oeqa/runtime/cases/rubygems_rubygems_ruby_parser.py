from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_ruby_parser(RubyGemsTestUtils):

    def test_exec_ruby_parse(self):
        self.gem_exec_wrapper("ruby_parse")

    def test_exec_ruby_parse_extract_error(self):
        self.gem_exec_wrapper("ruby_parse_extract_error")

    def test_exec_ruby_parse_extract_error_lock(self):
        self.gem_exec_wrapper("ruby_parse_extract_error.lock")

    def test_exec_ruby_parse_lock(self):
        self.gem_exec_wrapper("ruby_parse.lock")

    def test_gem_list_rubygems_ruby_parser(self):
        self.gem_is_installed("ruby_parser")

    def test_load_rp_extensions(self):
        self.gem_is_loadable("rp_extensions")

    def test_load_rp_stringscanner(self):
        self.gem_is_loadable("rp_stringscanner")

    def test_load_ruby_lexer(self):
        self.gem_is_loadable("ruby_lexer")

    def test_load_ruby_lexer_rex(self):
        self.gem_is_loadable("ruby_lexer.rex")

    def test_load_ruby_lexer_strings(self):
        self.gem_is_loadable("ruby_lexer_strings")

    def test_load_ruby_parser(self):
        self.gem_is_loadable("ruby_parser")

    def test_load_ruby_parser20(self):
        self.gem_is_loadable("ruby_parser20")

    def test_load_ruby_parser21(self):
        self.gem_is_loadable("ruby_parser21")

    def test_load_ruby_parser22(self):
        self.gem_is_loadable("ruby_parser22")

    def test_load_ruby_parser23(self):
        self.gem_is_loadable("ruby_parser23")

    def test_load_ruby_parser24(self):
        self.gem_is_loadable("ruby_parser24")

    def test_load_ruby_parser25(self):
        self.gem_is_loadable("ruby_parser25")

    def test_load_ruby_parser26(self):
        self.gem_is_loadable("ruby_parser26")

    def test_load_ruby_parser27(self):
        self.gem_is_loadable("ruby_parser27")

    def test_load_ruby_parser30(self):
        self.gem_is_loadable("ruby_parser30")

    def test_load_ruby_parser31(self):
        self.gem_is_loadable("ruby_parser31")

    def test_load_ruby_parser32(self):
        self.gem_is_loadable("ruby_parser32")

    def test_load_ruby_parser33(self):
        self.gem_is_loadable("ruby_parser33")

    def test_load_ruby_parser_extras(self):
        self.gem_is_loadable("ruby_parser_extras")

