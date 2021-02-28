from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_aws_sdk_iam(RubyGemsTestUtils):

    def test_gem_list_rubygems_aws_sdk_iam(self):
        self.gem_is_installed("aws-sdk-iam")

    def test_load_aws_sdk_iam(self):
        self.gem_is_loadable("aws-sdk-iam")

