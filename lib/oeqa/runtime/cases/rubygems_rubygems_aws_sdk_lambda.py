from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_aws_sdk_lambda(RubyGemsTestUtils):

    def test_gem_list_rubygems_aws_sdk_lambda(self):
        self.gem_is_installed("aws-sdk-lambda")

    def test_load_aws_sdk_lambda(self):
        self.gem_is_loadable("aws-sdk-lambda")

