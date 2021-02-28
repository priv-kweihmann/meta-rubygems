from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_aws_sdk_cloudformation(RubyGemsTestUtils):

    def test_gem_list_rubygems_aws_sdk_cloudformation(self):
        self.gem_is_installed("aws-sdk-cloudformation")

    def test_load_aws_sdk_cloudformation(self):
        self.gem_is_loadable("aws-sdk-cloudformation")

