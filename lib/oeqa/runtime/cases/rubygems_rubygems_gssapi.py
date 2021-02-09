from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_gssapi(RubyGemsTestUtils):

    def test_gem_list_rubygems_gssapi(self):
        self.gem_is_installed("gssapi")

    def test_load_gssapi(self):
        self.gem_is_loadable("gssapi")

