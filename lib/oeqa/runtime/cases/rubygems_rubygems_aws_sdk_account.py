from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_aws_sdk_account(RubyGemsTestUtils):

    def test_gem_list_rubygems_aws_sdk_account(self):
        self.gem_is_installed("aws-sdk-account")

    def test_load_aws_sdk_account(self):
        self.gem_is_loadable("aws-sdk-account")

