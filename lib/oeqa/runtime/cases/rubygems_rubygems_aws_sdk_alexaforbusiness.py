from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_aws_sdk_alexaforbusiness(RubyGemsTestUtils):

    def test_gem_list_rubygems_aws_sdk_alexaforbusiness(self):
        self.gem_is_installed("aws-sdk-alexaforbusiness")

    def test_load_aws_sdk_alexaforbusiness(self):
        self.gem_is_loadable("aws-sdk-alexaforbusiness")

