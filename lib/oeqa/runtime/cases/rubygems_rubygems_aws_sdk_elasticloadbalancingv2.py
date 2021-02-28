from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_aws_sdk_elasticloadbalancingv2(RubyGemsTestUtils):

    def test_gem_list_rubygems_aws_sdk_elasticloadbalancingv2(self):
        self.gem_is_installed("aws-sdk-elasticloadbalancingv2")

    def test_load_aws_sdk_elasticloadbalancingv2(self):
        self.gem_is_loadable("aws-sdk-elasticloadbalancingv2")

