from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_aws_sdk_cloudwatchevents(RubyGemsTestUtils):

    def test_gem_list_rubygems_aws_sdk_cloudwatchevents(self):
        self.gem_is_installed("aws-sdk-cloudwatchevents")

    def test_load_aws_sdk_cloudwatchevents(self):
        self.gem_is_loadable("aws-sdk-cloudwatchevents")

