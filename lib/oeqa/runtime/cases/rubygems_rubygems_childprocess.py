from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_childprocess(RubyGemsTestUtils):

    def test_gem_list_rubygems_childprocess(self):
        self.gem_is_installed("childprocess")

    def test_load_childprocess(self):
        self.gem_is_loadable("childprocess")

