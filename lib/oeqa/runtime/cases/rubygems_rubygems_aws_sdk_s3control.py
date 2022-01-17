from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_aws_sdk_s3control(RubyGemsTestUtils):

    def test_gem_list_rubygems_aws_sdk_s3control(self):
        self.gem_is_installed("aws-sdk-s3control")

    def test_load_aws_sdk_s3control(self):
        self.gem_is_loadable("aws-sdk-s3control")

