from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_os(RubyGemsTestUtils):

    def test_gem_list_rubygems_os(self):
        self.gem_is_installed("os")

    def test_load_os(self):
        self.gem_is_loadable("os")

