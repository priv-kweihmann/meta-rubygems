from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_tty_reader(RubyGemsTestUtils):

    def test_gem_list_rubygems_tty_reader(self):
        self.gem_is_installed("tty-reader")

    def test_load_tty_reader(self):
        self.gem_is_loadable("tty-reader")

