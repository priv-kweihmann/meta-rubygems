from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_aws_sdk_apigatewayv2(RubyGemsTestUtils):

    def test_gem_list_rubygems_aws_sdk_apigatewayv2(self):
        self.gem_is_installed("aws-sdk-apigatewayv2")

    def test_load_aws_sdk_apigatewayv2(self):
        self.gem_is_loadable("aws-sdk-apigatewayv2")

