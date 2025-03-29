from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_ruby_termios(RubyGemsTestUtils):

    def test_gem_list_rubygems_ruby_termios(self):
        self.gem_is_installed("ruby-termios")

    def test_load_termios(self):
        self.gem_is_loadable("termios")

