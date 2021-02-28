from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_representable(RubyGemsTestUtils):

    def test_gem_list_rubygems_representable(self):
        self.gem_is_installed("representable")

    def test_load_representable(self):
        self.gem_is_loadable("representable")

