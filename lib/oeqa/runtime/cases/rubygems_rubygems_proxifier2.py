from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_proxifier2(RubyGemsTestUtils):

    def test_exec_pirb2(self):
        self.gem_exec_wrapper("pirb")

    def test_exec_pruby2(self):
        self.gem_exec_wrapper("pruby")

    def test_gem_list_rubygems_proxifier2(self):
        self.gem_is_installed("proxifier2")

    def test_load_proxifier(self):
        self.gem_is_loadable("proxifier")

