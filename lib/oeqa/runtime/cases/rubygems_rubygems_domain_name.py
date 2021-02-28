from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_domain_name(RubyGemsTestUtils):

    def test_gem_list_rubygems_domain_name(self):
        self.gem_is_installed("domain_name")

    def test_load_domain_name(self):
        self.gem_is_loadable("domain_name")

