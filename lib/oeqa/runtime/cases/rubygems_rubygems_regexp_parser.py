from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_regexp_parser(RubyGemsTestUtils):

    def test_gem_list_rubygems_regexp_parser(self):
        self.gem_is_installed("regexp_parser")

    def test_load_regexp_parser(self):
        self.gem_is_loadable("regexp_parser")

