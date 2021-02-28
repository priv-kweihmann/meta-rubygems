from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_uber(RubyGemsTestUtils):

    def test_gem_list_rubygems_uber(self):
        self.gem_is_installed("uber")

    def test_load_uber(self):
        self.gem_is_loadable("uber")

