from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_bindata(RubyGemsTestUtils):

    def test_gem_list_rubygems_bindata(self):
        self.gem_is_installed("bindata")

    def test_load_bindata(self):
        self.gem_is_loadable("bindata")

