from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_webrick(RubyGemsTestUtils):

    def test_gem_list_rubygems_webrick(self):
        self.gem_is_installed("webrick")

    def test_load_webrick(self):
        self.gem_is_loadable("webrick")

