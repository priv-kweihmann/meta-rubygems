from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_faraday(RubyGemsTestUtils):

    def test_gem_list_rubygems_faraday(self):
        self.gem_is_installed("faraday")

    def test_load_faraday(self):
        self.gem_is_loadable("faraday")

