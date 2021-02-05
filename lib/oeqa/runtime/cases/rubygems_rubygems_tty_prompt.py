from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_tty_prompt(RubyGemsTestUtils):

    def test_gem_list_rubygems_tty_prompt(self):
        self.gem_is_installed("tty-prompt")

    def test_load_tty_prompt(self):
        self.gem_is_loadable("tty-prompt")

