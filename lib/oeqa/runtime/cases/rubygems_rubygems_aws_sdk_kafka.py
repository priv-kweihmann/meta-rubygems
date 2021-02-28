from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_aws_sdk_kafka(RubyGemsTestUtils):

    def test_gem_list_rubygems_aws_sdk_kafka(self):
        self.gem_is_installed("aws-sdk-kafka")

    def test_load_aws_sdk_kafka(self):
        self.gem_is_loadable("aws-sdk-kafka")

