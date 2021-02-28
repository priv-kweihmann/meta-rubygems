from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_aws_sdk_sqs(RubyGemsTestUtils):

    def test_gem_list_rubygems_aws_sdk_sqs(self):
        self.gem_is_installed("aws-sdk-sqs")

    def test_load_aws_sdk_sqs(self):
        self.gem_is_loadable("aws-sdk-sqs")

