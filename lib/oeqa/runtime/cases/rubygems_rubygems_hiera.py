from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_hiera(RubyGemsTestUtils):

    def test_exec_hiera(self):
        self.gem_exec_wrapper("hiera")

    def test_gem_list_rubygems_hiera(self):
        self.gem_is_installed("hiera")

    def test_load_hiera(self):
        self.gem_is_loadable("hiera")

