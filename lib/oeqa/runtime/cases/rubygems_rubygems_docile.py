from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_docile(RubyGemsTestUtils):

    def test_gem_list_rubygems_docile(self):
        self.gem_is_installed("docile")

    def test_load_docile(self):
        self.gem_is_loadable("docile")

