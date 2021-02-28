from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_aws_sdk_ecs(RubyGemsTestUtils):

    def test_gem_list_rubygems_aws_sdk_ecs(self):
        self.gem_is_installed("aws-sdk-ecs")

    def test_load_aws_sdk_ecs(self):
        self.gem_is_loadable("aws-sdk-ecs")

