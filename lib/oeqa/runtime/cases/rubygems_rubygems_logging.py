from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_logging(RubyGemsTestUtils):

    def test_gem_list_rubygems_logging(self):
        self.gem_is_installed("logging")

    def test_load_logging(self):
        self.gem_is_loadable("logging")

