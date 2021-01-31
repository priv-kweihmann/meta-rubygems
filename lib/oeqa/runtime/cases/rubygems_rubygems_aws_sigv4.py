from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_aws_sigv4(RubyGemsTestUtils):

    def test_gem_list_rubygems_aws_sigv4(self):
        self.gem_is_installed("aws-sigv4")

    def test_load_aws_sigv4(self):
        self.gem_is_loadable("aws-sigv4")

