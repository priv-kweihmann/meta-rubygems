from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_activemodel(RubyGemsTestUtils):

    def test_gem_list_rubygems_activemodel(self):
        self.gem_is_installed("activemodel")

    def test_load_active_model(self):
        self.gem_is_loadable("active_model")

