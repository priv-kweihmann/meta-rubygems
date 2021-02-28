from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_aws_sdk_codepipeline(RubyGemsTestUtils):

    def test_gem_list_rubygems_aws_sdk_codepipeline(self):
        self.gem_is_installed("aws-sdk-codepipeline")

    def test_load_aws_sdk_codepipeline(self):
        self.gem_is_loadable("aws-sdk-codepipeline")

