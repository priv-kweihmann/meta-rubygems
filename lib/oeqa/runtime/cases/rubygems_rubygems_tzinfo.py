from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_tzinfo(RubyGemsTestUtils):

    def test_gem_list_rubygems_tzinfo(self):
        self.gem_is_installed("tzinfo")

    def test_load_tzinfo(self):
        self.gem_is_loadable("tzinfo")

