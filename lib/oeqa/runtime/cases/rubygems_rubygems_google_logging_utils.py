from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_google_logging_utils(RubyGemsTestUtils):

    def test_gem_list_rubygems_google_logging_utils(self):
        self.gem_is_installed("google-logging-utils")

    def test_load_google_logging_utils(self):
        self.gem_is_loadable("google-logging-utils")

