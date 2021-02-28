from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_aws_sdk_autoscaling(RubyGemsTestUtils):

    def test_gem_list_rubygems_aws_sdk_autoscaling(self):
        self.gem_is_installed("aws-sdk-autoscaling")

    def test_load_aws_sdk_autoscaling(self):
        self.gem_is_loadable("aws-sdk-autoscaling")

