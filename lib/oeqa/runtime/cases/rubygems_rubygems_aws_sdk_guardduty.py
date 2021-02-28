from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_aws_sdk_guardduty(RubyGemsTestUtils):

    def test_gem_list_rubygems_aws_sdk_guardduty(self):
        self.gem_is_installed("aws-sdk-guardduty")

    def test_load_aws_sdk_guardduty(self):
        self.gem_is_loadable("aws-sdk-guardduty")

