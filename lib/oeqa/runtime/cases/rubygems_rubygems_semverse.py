from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_semverse(RubyGemsTestUtils):

    def test_gem_list_rubygems_semverse(self):
        self.gem_is_installed("semverse")

    def test_load_semverse(self):
        self.gem_is_loadable("semverse")

