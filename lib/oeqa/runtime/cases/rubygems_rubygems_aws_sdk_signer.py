from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_aws_sdk_signer(RubyGemsTestUtils):

    def test_gem_list_rubygems_aws_sdk_signer(self):
        self.gem_is_installed("aws-sdk-signer")

    def test_load_aws_sdk_signer(self):
        self.gem_is_loadable("aws-sdk-signer")

