from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_sassc(RubyGemsTestUtils):

    def test_gem_list_rubygems_sassc(self):
        self.gem_is_installed("sassc")

    def test_load_sassc(self):
        self.gem_is_loadable("sassc")

