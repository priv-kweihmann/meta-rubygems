from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_aws_sdk_applicationautoscaling(RubyGemsTestUtils):

    def test_gem_list_rubygems_aws_sdk_applicationautoscaling(self):
        self.gem_is_installed("aws-sdk-applicationautoscaling")

    def test_load_aws_sdk_applicationautoscaling(self):
        self.gem_is_loadable("aws-sdk-applicationautoscaling")

