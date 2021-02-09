from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_proxifier(RubyGemsTestUtils):

    def test_exec_pirb(self):
        self.gem_exec_wrapper("pirb")

    def test_exec_pruby(self):
        self.gem_exec_wrapper("pruby")

    def test_gem_list_rubygems_proxifier(self):
        self.gem_is_installed("proxifier")

    def test_load_proxifier(self):
        self.gem_is_loadable("proxifier")

