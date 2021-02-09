from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_specinfra(RubyGemsTestUtils):

    def test_gem_list_rubygems_specinfra(self):
        self.gem_is_installed("specinfra")

    def test_load_specinfra(self):
        self.gem_is_loadable("specinfra")

