from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_aws_sdk_cognitoidentityprovider(RubyGemsTestUtils):

    def test_gem_list_rubygems_aws_sdk_cognitoidentityprovider(self):
        self.gem_is_installed("aws-sdk-cognitoidentityprovider")

    def test_load_aws_sdk_cognitoidentityprovider(self):
        self.gem_is_loadable("aws-sdk-cognitoidentityprovider")

