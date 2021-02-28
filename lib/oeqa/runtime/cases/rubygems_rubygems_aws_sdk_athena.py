from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_aws_sdk_athena(RubyGemsTestUtils):

    def test_gem_list_rubygems_aws_sdk_athena(self):
        self.gem_is_installed("aws-sdk-athena")

    def test_load_aws_sdk_athena(self):
        self.gem_is_loadable("aws-sdk-athena")

