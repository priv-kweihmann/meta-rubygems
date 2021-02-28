from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_axiom_types(RubyGemsTestUtils):

    def test_gem_list_rubygems_axiom_types(self):
        self.gem_is_installed("axiom-types")

    def test_load_axiom_types(self):
        self.gem_is_loadable("axiom-types")

