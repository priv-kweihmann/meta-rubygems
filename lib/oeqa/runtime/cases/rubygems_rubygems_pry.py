from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_pry(RubyGemsTestUtils):

    def test_exec_pry(self):
        self.gem_exec_wrapper("pry")

    def test_gem_list_rubygems_pry(self):
        self.gem_is_installed("pry")

    def test_load_pry(self):
        self.gem_is_loadable("pry")

