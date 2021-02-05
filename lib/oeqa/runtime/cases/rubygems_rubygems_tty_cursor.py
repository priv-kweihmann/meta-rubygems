from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_tty_cursor(RubyGemsTestUtils):

    def test_gem_list_rubygems_tty_cursor(self):
        self.gem_is_installed("tty-cursor")

    def test_load_tty_cursor(self):
        self.gem_is_loadable("tty-cursor")

