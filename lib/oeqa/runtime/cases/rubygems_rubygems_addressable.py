from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_addressable(RubyGemsTestUtils):

    def test_gem_list_rubygems_addressable(self):
        self.gem_is_installed("addressable")

    def test_load_addressable(self):
        self.gem_is_loadable("addressable")

