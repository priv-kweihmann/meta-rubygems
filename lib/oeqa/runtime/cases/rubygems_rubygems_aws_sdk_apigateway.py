from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_aws_sdk_apigateway(RubyGemsTestUtils):

    def test_gem_list_rubygems_aws_sdk_apigateway(self):
        self.gem_is_installed("aws-sdk-apigateway")

    def test_load_aws_sdk_apigateway(self):
        self.gem_is_loadable("aws-sdk-apigateway")

