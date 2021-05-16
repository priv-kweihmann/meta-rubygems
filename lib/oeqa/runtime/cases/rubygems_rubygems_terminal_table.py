from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_terminal_table(RubyGemsTestUtils):

    def test_gem_list_rubygems_terminal_table(self):
        self.gem_is_installed("terminal-table")

    def test_load_terminal_table(self):
        self.gem_is_loadable("terminal-table")

