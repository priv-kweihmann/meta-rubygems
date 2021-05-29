from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_aws_sdk_eventbridge(RubyGemsTestUtils):

    def test_gem_list_rubygems_aws_sdk_eventbridge(self):
        self.gem_is_installed("aws-sdk-eventbridge")

    def test_load_aws_sdk_eventbridge(self):
        self.gem_is_loadable("aws-sdk-eventbridge")

