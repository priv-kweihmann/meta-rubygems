from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_wmi_lite(RubyGemsTestUtils):

    def test_gem_list_rubygems_wmi_lite(self):
        self.gem_is_installed("wmi-lite")

    def test_load_wmi_lite(self):
        self.gem_is_loadable("wmi-lite")

