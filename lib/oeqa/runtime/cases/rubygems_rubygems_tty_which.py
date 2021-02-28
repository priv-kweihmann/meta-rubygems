from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_tty_which(RubyGemsTestUtils):

    def test_gem_list_rubygems_tty_which(self):
        self.gem_is_installed("tty-which")

    def test_load_tty_which(self):
        self.gem_is_loadable("tty-which")

