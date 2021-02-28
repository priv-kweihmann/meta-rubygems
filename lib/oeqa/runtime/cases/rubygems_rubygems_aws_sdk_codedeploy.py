from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_aws_sdk_codedeploy(RubyGemsTestUtils):

    def test_gem_list_rubygems_aws_sdk_codedeploy(self):
        self.gem_is_installed("aws-sdk-codedeploy")

    def test_load_aws_sdk_codedeploy(self):
        self.gem_is_loadable("aws-sdk-codedeploy")

