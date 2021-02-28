from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_aws_sdk_kinesis(RubyGemsTestUtils):

    def test_gem_list_rubygems_aws_sdk_kinesis(self):
        self.gem_is_installed("aws-sdk-kinesis")

    def test_load_aws_sdk_kinesis(self):
        self.gem_is_loadable("aws-sdk-kinesis")

