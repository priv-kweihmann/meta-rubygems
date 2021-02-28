from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_aws_sdk_kms(RubyGemsTestUtils):

    def test_gem_list_rubygems_aws_sdk_kms(self):
        self.gem_is_installed("aws-sdk-kms")

    def test_load_aws_sdk_kms(self):
        self.gem_is_loadable("aws-sdk-kms")

