from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_em_socksify(RubyGemsTestUtils):

    def test_gem_list_rubygems_em_socksify(self):
        self.gem_is_installed("em-socksify")

    def test_load_em_socksify(self):
        self.gem_is_loadable("em-socksify")

