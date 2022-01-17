from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_rubocop(RubyGemsTestUtils):

    def test_exec_rubocop(self):
        self.gem_exec_wrapper("rubocop")

    def test_gem_list_rubygems_rubocop(self):
        self.gem_is_installed("rubocop")

    def test_load_rubocop(self):
        self.gem_is_loadable("rubocop")

