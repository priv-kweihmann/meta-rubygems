from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_strings(RubyGemsTestUtils):

    def test_gem_list_rubygems_strings(self):
        self.gem_is_installed("strings")

    def test_load_strings(self):
        self.gem_is_loadable("strings")

