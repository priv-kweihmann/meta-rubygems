from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_aws_sdk_cognitoidentity(RubyGemsTestUtils):

    def test_gem_list_rubygems_aws_sdk_cognitoidentity(self):
        self.gem_is_installed("aws-sdk-cognitoidentity")

    def test_load_aws_sdk_cognitoidentity(self):
        self.gem_is_loadable("aws-sdk-cognitoidentity")

