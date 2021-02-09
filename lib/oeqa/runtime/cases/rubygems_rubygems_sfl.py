from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_sfl(RubyGemsTestUtils):

    def test_gem_list_rubygems_sfl(self):
        self.gem_is_installed("sfl")

    def test_load_sfl(self):
        self.gem_is_loadable("sfl")

