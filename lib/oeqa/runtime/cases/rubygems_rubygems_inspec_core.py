from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_inspec_core(RubyGemsTestUtils):

    def test_gem_list_rubygems_inspec_core(self):
        self.gem_is_installed("inspec-core")

    def test_load_inspec(self):
        self.gem_is_loadable("inspec")

