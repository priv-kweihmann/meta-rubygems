from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_gems(RubyGemsTestUtils):

    def test_gem_list_rubygems_gems(self):
        self.gem_is_installed("gems")

    def test_load_gems(self):
        self.gem_is_loadable("gems")

