from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_ipaddress(RubyGemsTestUtils):

    def test_gem_list_rubygems_ipaddress(self):
        self.gem_is_installed("ipaddress")

    def test_load_ipaddress(self):
        self.gem_is_loadable("ipaddress")

