from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_ms_rest_azure(RubyGemsTestUtils):

    def test_gem_list_rubygems_ms_rest_azure(self):
        self.gem_is_installed("ms_rest_azure")

    def test_load_ms_rest_azure(self):
        self.gem_is_loadable("ms_rest_azure")

