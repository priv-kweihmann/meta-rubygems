from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_aws_sdk_ec2(RubyGemsTestUtils):

    def test_gem_list_rubygems_aws_sdk_ec2(self):
        self.gem_is_installed("aws-sdk-ec2")

    def test_load_aws_sdk_ec2(self):
        self.gem_is_loadable("aws-sdk-ec2")

