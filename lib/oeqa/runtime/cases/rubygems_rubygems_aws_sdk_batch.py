from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_aws_sdk_batch(RubyGemsTestUtils):

    def test_gem_list_rubygems_aws_sdk_batch(self):
        self.gem_is_installed("aws-sdk-batch")

    def test_load_aws_sdk_batch(self):
        self.gem_is_loadable("aws-sdk-batch")

