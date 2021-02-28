from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_aws_sdk_sms(RubyGemsTestUtils):

    def test_gem_list_rubygems_aws_sdk_sms(self):
        self.gem_is_installed("aws-sdk-sms")

    def test_load_aws_sdk_sms(self):
        self.gem_is_loadable("aws-sdk-sms")

