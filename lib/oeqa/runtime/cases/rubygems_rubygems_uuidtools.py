from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_uuidtools(RubyGemsTestUtils):

    def test_gem_list_rubygems_uuidtools(self):
        self.gem_is_installed("uuidtools")

    def test_load_uuidtools(self):
        self.gem_is_loadable("uuidtools")

