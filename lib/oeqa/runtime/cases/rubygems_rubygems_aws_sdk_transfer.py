from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_aws_sdk_transfer(RubyGemsTestUtils):

    def test_gem_list_rubygems_aws_sdk_transfer(self):
        self.gem_is_installed("aws-sdk-transfer")

    def test_load_aws_sdk_transfer(self):
        self.gem_is_loadable("aws-sdk-transfer")

