from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_aws_sdk_codecommit(RubyGemsTestUtils):

    def test_gem_list_rubygems_aws_sdk_codecommit(self):
        self.gem_is_installed("aws-sdk-codecommit")

    def test_load_aws_sdk_codecommit(self):
        self.gem_is_loadable("aws-sdk-codecommit")

