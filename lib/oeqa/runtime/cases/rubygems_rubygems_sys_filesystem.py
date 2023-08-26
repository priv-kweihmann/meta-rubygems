from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_sys_filesystem(RubyGemsTestUtils):

    def test_gem_list_rubygems_sys_filesystem(self):
        self.gem_is_installed("sys-filesystem")

    def test_load_sys_filesystem(self):
        self.gem_is_loadable("sys-filesystem")

