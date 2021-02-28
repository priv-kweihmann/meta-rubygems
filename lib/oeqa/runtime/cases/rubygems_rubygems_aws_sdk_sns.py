from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_aws_sdk_sns(RubyGemsTestUtils):

    def test_gem_list_rubygems_aws_sdk_sns(self):
        self.gem_is_installed("aws-sdk-sns")

    def test_load_aws_sdk_sns(self):
        self.gem_is_loadable("aws-sdk-sns")

