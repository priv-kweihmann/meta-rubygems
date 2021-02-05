from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_rspec_core(RubyGemsTestUtils):

    def test_exec_rspec(self):
        self.gem_exec_wrapper("rspec")

    def test_gem_list_rubygems_rspec_core(self):
        self.gem_is_installed("rspec-core")

