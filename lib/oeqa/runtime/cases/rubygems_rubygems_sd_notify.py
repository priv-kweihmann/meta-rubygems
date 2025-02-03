from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_sd_notify(RubyGemsTestUtils):

    def test_gem_list_rubygems_sd_notify(self):
        self.gem_is_installed("sd_notify")

    def test_load_sd_notify(self):
        self.gem_is_loadable("sd_notify")

