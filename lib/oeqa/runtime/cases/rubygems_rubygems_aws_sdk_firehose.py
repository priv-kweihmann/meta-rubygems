from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_aws_sdk_firehose(RubyGemsTestUtils):

    def test_gem_list_rubygems_aws_sdk_firehose(self):
        self.gem_is_installed("aws-sdk-firehose")

    def test_load_aws_sdk_firehose(self):
        self.gem_is_loadable("aws-sdk-firehose")

