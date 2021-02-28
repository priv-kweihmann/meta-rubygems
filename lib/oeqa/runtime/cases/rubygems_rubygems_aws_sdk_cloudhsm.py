from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_aws_sdk_cloudhsm(RubyGemsTestUtils):

    def test_gem_list_rubygems_aws_sdk_cloudhsm(self):
        self.gem_is_installed("aws-sdk-cloudhsm")

    def test_load_aws_sdk_cloudhsm(self):
        self.gem_is_loadable("aws-sdk-cloudhsm")

