from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_parallel(RubyGemsTestUtils):

    def test_gem_list_rubygems_parallel(self):
        self.gem_is_installed("parallel")

    def test_load_parallel(self):
        self.gem_is_loadable("parallel")

