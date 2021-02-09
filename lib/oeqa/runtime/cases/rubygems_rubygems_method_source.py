from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_method_source(RubyGemsTestUtils):

    def test_gem_list_rubygems_method_source(self):
        self.gem_is_installed("method_source")

    def test_load_method_source(self):
        self.gem_is_loadable("method_source")

