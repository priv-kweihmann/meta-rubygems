from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_minitest(RubyGemsTestUtils):

    def test_gem_list_rubygems_minitest(self):
        self.gem_is_installed("minitest")

    def test_load_minitest(self):
        self.gem_is_loadable("minitest")

