from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_aws_sdk_redshift(RubyGemsTestUtils):

    def test_gem_list_rubygems_aws_sdk_redshift(self):
        self.gem_is_installed("aws-sdk-redshift")

    def test_load_aws_sdk_redshift(self):
        self.gem_is_loadable("aws-sdk-redshift")

