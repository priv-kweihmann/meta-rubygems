from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_trailblazer_option(RubyGemsTestUtils):

    def test_gem_list_rubygems_trailblazer_option(self):
        self.gem_is_installed("trailblazer-option")

    def test_load_trailblazer_option(self):
        self.gem_is_loadable("trailblazer-option")

