from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_aws_sdk_waf(RubyGemsTestUtils):

    def test_gem_list_rubygems_aws_sdk_waf(self):
        self.gem_is_installed("aws-sdk-waf")

    def test_load_aws_sdk_waf(self):
        self.gem_is_loadable("aws-sdk-waf")

