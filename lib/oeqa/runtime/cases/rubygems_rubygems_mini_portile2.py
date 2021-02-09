from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_mini_portile2(RubyGemsTestUtils):

    def test_gem_list_rubygems_mini_portile2(self):
        self.gem_is_installed("mini_portile2")

    def test_load_mini_portile2(self):
        self.gem_is_loadable("mini_portile2")

