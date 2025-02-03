from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_xmldsig(RubyGemsTestUtils):

    def test_gem_list_rubygems_xmldsig(self):
        self.gem_is_installed("xmldsig")

    def test_load_xmldsig(self):
        self.gem_is_loadable("xmldsig")

