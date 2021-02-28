from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_aws_sdk_elasticloadbalancing(RubyGemsTestUtils):

    def test_gem_list_rubygems_aws_sdk_elasticloadbalancing(self):
        self.gem_is_installed("aws-sdk-elasticloadbalancing")

    def test_load_aws_sdk_elasticloadbalancing(self):
        self.gem_is_loadable("aws-sdk-elasticloadbalancing")

