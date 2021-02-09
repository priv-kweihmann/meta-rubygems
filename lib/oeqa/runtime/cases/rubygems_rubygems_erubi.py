from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_erubi(RubyGemsTestUtils):

    def test_gem_list_rubygems_erubi(self):
        self.gem_is_installed("erubi")

    def test_load_erubi(self):
        self.gem_is_loadable("erubi")

