from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_inspec_bin(RubyGemsTestUtils):

    def test_exec_inspec(self):
        self.gem_exec_wrapper("inspec")

    def test_gem_list_rubygems_inspec_bin(self):
        self.gem_is_installed("inspec-bin")

