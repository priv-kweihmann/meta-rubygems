from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_google_cloud_env(RubyGemsTestUtils):

    def test_gem_list_rubygems_google_cloud_env(self):
        self.gem_is_installed("google-cloud-env")

    def test_load_google_cloud_env(self):
        self.gem_is_loadable("google-cloud-env")

