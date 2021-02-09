from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_strings_ansi(RubyGemsTestUtils):

    def test_gem_list_rubygems_strings_ansi(self):
        self.gem_is_installed("strings-ansi")

    def test_load_strings_ansi(self):
        self.gem_is_loadable("strings-ansi")

