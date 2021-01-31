from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_diff_lcs(RubyGemsTestUtils):

    def test_gem_list_rubygems_diff_lcs(self):
        self.gem_is_installed("diff-lcs")

    def test_load_diff_lcs(self):
        self.gem_is_loadable("diff-lcs")

