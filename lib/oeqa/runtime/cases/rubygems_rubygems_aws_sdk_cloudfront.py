from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_aws_sdk_cloudfront(RubyGemsTestUtils):

    def test_gem_list_rubygems_aws_sdk_cloudfront(self):
        self.gem_is_installed("aws-sdk-cloudfront")

    def test_load_aws_sdk_cloudfront(self):
        self.gem_is_loadable("aws-sdk-cloudfront")

