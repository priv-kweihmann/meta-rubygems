from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_aws_sdk_cloudwatchlogs(RubyGemsTestUtils):

    def test_gem_list_rubygems_aws_sdk_cloudwatchlogs(self):
        self.gem_is_installed("aws-sdk-cloudwatchlogs")

    def test_load_aws_sdk_cloudwatchlogs(self):
        self.gem_is_loadable("aws-sdk-cloudwatchlogs")

