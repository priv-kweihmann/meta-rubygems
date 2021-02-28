from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_aws_sdk_rds(RubyGemsTestUtils):

    def test_gem_list_rubygems_aws_sdk_rds(self):
        self.gem_is_installed("aws-sdk-rds")

    def test_load_aws_sdk_rds(self):
        self.gem_is_loadable("aws-sdk-rds")

