from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_ed25519(RubyGemsTestUtils):

    def test_gem_list_rubygems_ed25519(self):
        self.gem_is_installed("ed25519")

    def test_load_ed25519(self):
        self.gem_is_loadable("ed25519")

