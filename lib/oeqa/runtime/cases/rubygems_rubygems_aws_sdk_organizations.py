from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_aws_sdk_organizations(RubyGemsTestUtils):

    def test_gem_list_rubygems_aws_sdk_organizations(self):
        self.gem_is_installed("aws-sdk-organizations")

    def test_load_aws_sdk_organizations(self):
        self.gem_is_loadable("aws-sdk-organizations")

