from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_tty_box(RubyGemsTestUtils):

    def test_gem_list_rubygems_tty_box(self):
        self.gem_is_installed("tty-box")

    def test_load_tty_box(self):
        self.gem_is_loadable("tty-box")

