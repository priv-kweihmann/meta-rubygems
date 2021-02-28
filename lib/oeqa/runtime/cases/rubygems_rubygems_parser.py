from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_parser(RubyGemsTestUtils):

    def test_exec_ruby_parse(self):
        self.gem_exec_wrapper("ruby-parse")

    def test_exec_ruby_rewrite(self):
        self.gem_exec_wrapper("ruby-rewrite")

    def test_gem_list_rubygems_parser(self):
        self.gem_is_installed("parser")

    def test_load_gauntlet_parser(self):
        self.gem_is_loadable("gauntlet_parser")

    def test_load_parser(self):
        self.gem_is_loadable("parser")

