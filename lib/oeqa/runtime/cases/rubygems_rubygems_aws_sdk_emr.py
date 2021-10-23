from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_aws_sdk_emr(RubyGemsTestUtils):

    def test_gem_list_rubygems_aws_sdk_emr(self):
        self.gem_is_installed("aws-sdk-emr")

    def test_load_aws_sdk_emr(self):
        self.gem_is_loadable("aws-sdk-emr")

