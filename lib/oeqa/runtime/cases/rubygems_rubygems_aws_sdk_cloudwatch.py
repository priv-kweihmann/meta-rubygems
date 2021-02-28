from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_aws_sdk_cloudwatch(RubyGemsTestUtils):

    def test_gem_list_rubygems_aws_sdk_cloudwatch(self):
        self.gem_is_installed("aws-sdk-cloudwatch")

    def test_load_aws_sdk_cloudwatch(self):
        self.gem_is_loadable("aws-sdk-cloudwatch")

