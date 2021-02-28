from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_aws_sdk_dynamodb(RubyGemsTestUtils):

    def test_gem_list_rubygems_aws_sdk_dynamodb(self):
        self.gem_is_installed("aws-sdk-dynamodb")

    def test_load_aws_sdk_dynamodb(self):
        self.gem_is_loadable("aws-sdk-dynamodb")

