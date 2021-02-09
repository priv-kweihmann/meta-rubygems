from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_activesupport(RubyGemsTestUtils):

    def test_gem_list_rubygems_activesupport(self):
        self.gem_is_installed("activesupport")

    def test_load_active_support(self):
        self.gem_is_loadable("active_support")

