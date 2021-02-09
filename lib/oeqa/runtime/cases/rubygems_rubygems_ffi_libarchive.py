from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_ffi_libarchive(RubyGemsTestUtils):

    def test_gem_list_rubygems_ffi_libarchive(self):
        self.gem_is_installed("ffi-libarchive")

    def test_load_ffi_libarchive(self):
        self.gem_is_loadable("ffi-libarchive")

