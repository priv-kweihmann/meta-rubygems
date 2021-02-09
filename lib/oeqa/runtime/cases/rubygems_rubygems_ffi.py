from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_ffi(RubyGemsTestUtils):

    def test_gem_list_rubygems_ffi(self):
        self.gem_is_installed("ffi")

    def test_load_ffi(self):
        self.gem_is_loadable("ffi")

