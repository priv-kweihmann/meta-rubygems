from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_ffi_yajl(RubyGemsTestUtils):

    def test_exec_ffi_yajl_bench(self):
        self.gem_exec_wrapper("ffi-yajl-bench")

    def test_gem_list_rubygems_ffi_yajl(self):
        self.gem_is_installed("ffi-yajl")

    def test_load_ffi_yajl(self):
        self.gem_is_loadable("ffi_yajl")

