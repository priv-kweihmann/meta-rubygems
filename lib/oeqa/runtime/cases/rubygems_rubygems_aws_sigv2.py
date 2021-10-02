from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_aws_sigv2(RubyGemsTestUtils):

    def test_gem_list_rubygems_aws_sigv2(self):
        self.gem_is_installed("aws-sigv2")

    def test_load_aws_sigv2(self):
        self.gem_is_loadable("aws-sigv2")

