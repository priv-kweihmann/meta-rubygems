from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_puppetmodule_netdev_stdlib(RubyGemsTestUtils):

    def test_gem_list_rubygems_puppetmodule_netdev_stdlib(self):
        self.gem_is_installed("puppetmodule-netdev_stdlib")

    def test_load_netdev_stdlib(self):
        self.gem_is_loadable("netdev_stdlib")

