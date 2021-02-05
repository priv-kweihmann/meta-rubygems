from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_tty_screen(RubyGemsTestUtils):

    def test_gem_list_rubygems_tty_screen(self):
        self.gem_is_installed("tty-screen")

    def test_load_tty_screen(self):
        self.gem_is_loadable("tty-screen")

