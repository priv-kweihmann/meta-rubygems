from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_aws_sdk_eks(RubyGemsTestUtils):

    def test_gem_list_rubygems_aws_sdk_eks(self):
        self.gem_is_installed("aws-sdk-eks")

    def test_load_aws_sdk_eks(self):
        self.gem_is_loadable("aws-sdk-eks")

