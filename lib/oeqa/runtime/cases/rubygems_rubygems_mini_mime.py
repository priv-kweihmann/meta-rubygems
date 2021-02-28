from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_mini_mime(RubyGemsTestUtils):

    def test_gem_list_rubygems_mini_mime(self):
        self.gem_is_installed("mini_mime")

    def test_load_mini_mime(self):
        self.gem_is_loadable("mini_mime")

