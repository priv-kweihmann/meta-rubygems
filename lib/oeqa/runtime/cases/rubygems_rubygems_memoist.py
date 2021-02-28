from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_memoist(RubyGemsTestUtils):

    def test_gem_list_rubygems_memoist(self):
        self.gem_is_installed("memoist")

    def test_load_memoist(self):
        self.gem_is_loadable("memoist")

