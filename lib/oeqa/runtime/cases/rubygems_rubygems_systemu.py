from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_systemu(RubyGemsTestUtils):

    def test_gem_list_rubygems_systemu(self):
        self.gem_is_installed("systemu")

    def test_load_systemu(self):
        self.gem_is_loadable("systemu")

