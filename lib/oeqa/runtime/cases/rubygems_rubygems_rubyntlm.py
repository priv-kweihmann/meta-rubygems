from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_rubyntlm(RubyGemsTestUtils):

    def test_gem_list_rubygems_rubyntlm(self):
        self.gem_is_installed("rubyntlm")

    def test_load_rubyntlm(self):
        self.gem_is_loadable("rubyntlm")

