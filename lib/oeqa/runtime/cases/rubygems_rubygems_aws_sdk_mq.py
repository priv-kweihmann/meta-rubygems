from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_aws_sdk_mq(RubyGemsTestUtils):

    def test_gem_list_rubygems_aws_sdk_mq(self):
        self.gem_is_installed("aws-sdk-mq")

    def test_load_aws_sdk_mq(self):
        self.gem_is_loadable("aws-sdk-mq")

