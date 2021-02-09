from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_erubis(RubyGemsTestUtils):

    def test_exec_erubis(self):
        self.gem_exec_wrapper("erubis")

    def test_gem_list_rubygems_erubis(self):
        self.gem_is_installed("erubis")

    def test_load_erubis(self):
        self.gem_is_loadable("erubis")

