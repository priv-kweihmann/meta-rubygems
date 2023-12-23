from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_aws_sdk_wafv2(RubyGemsTestUtils):

    def test_gem_list_rubygems_aws_sdk_wafv2(self):
        self.gem_is_installed("aws-sdk-wafv2")

    def test_load_aws_sdk_wafv2(self):
        self.gem_is_loadable("aws-sdk-wafv2")

