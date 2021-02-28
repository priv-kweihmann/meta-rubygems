from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_declarative_option(RubyGemsTestUtils):

    def test_gem_list_rubygems_declarative_option(self):
        self.gem_is_installed("declarative-option")

    def test_load_declarative_option(self):
        self.gem_is_loadable("declarative-option")

