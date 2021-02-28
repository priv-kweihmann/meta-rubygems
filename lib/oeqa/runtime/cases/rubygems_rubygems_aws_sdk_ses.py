from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_aws_sdk_ses(RubyGemsTestUtils):

    def test_gem_list_rubygems_aws_sdk_ses(self):
        self.gem_is_installed("aws-sdk-ses")

    def test_load_aws_sdk_ses(self):
        self.gem_is_loadable("aws-sdk-ses")

