from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_hashdiff(RubyGemsTestUtils):

    def test_gem_list_rubygems_hashdiff(self):
        self.gem_is_installed("hashdiff")

    def test_load_hashdiff(self):
        self.gem_is_loadable("hashdiff")

