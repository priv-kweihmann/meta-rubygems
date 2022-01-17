from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_patron(RubyGemsTestUtils):

    def test_gem_list_rubygems_patron(self):
        self.gem_is_installed("patron")

    def test_load_patron(self):
        self.gem_is_loadable("patron")

