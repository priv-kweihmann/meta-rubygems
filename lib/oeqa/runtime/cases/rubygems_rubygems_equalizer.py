from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_equalizer(RubyGemsTestUtils):

    def test_gem_list_rubygems_equalizer(self):
        self.gem_is_installed("equalizer")

    def test_load_equalizer(self):
        self.gem_is_loadable("equalizer")

