from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_tty_table(RubyGemsTestUtils):

    def test_gem_list_rubygems_tty_table(self):
        self.gem_is_installed("tty-table")

    def test_load_tty_table(self):
        self.gem_is_loadable("tty-table")

