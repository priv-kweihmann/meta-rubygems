from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_tty_color(RubyGemsTestUtils):

    def test_gem_list_rubygems_tty_color(self):
        self.gem_is_installed("tty-color")

    def test_load_tty_color(self):
        self.gem_is_loadable("tty-color")

