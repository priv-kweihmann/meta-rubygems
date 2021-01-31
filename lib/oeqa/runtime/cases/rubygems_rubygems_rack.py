from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_rack(RubyGemsTestUtils):

    def test_gem_list_rubygems_rack(self):
        self.gem_is_installed("rack")

    def test_load_rack(self):
        self.gem_is_loadable("rack")

