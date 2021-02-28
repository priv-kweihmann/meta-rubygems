from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_aws_sdk_elasticache(RubyGemsTestUtils):

    def test_gem_list_rubygems_aws_sdk_elasticache(self):
        self.gem_is_installed("aws-sdk-elasticache")

    def test_load_aws_sdk_elasticache(self):
        self.gem_is_loadable("aws-sdk-elasticache")

