from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_aws_sdk_cloudtrail(RubyGemsTestUtils):

    def test_gem_list_rubygems_aws_sdk_cloudtrail(self):
        self.gem_is_installed("aws-sdk-cloudtrail")

    def test_load_aws_sdk_cloudtrail(self):
        self.gem_is_loadable("aws-sdk-cloudtrail")

