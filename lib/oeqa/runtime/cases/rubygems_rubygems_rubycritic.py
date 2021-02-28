from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_rubycritic(RubyGemsTestUtils):

    def test_exec_rubycritic(self):
        self.gem_exec_wrapper("rubycritic")

    def test_gem_list_rubygems_rubycritic(self):
        self.gem_is_installed("rubycritic")

    def test_load_rubycritic(self):
        self.gem_is_loadable("rubycritic")

