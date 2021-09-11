from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_aws_sdk_networkfirewall(RubyGemsTestUtils):

    def test_gem_list_rubygems_aws_sdk_networkfirewall(self):
        self.gem_is_installed("aws-sdk-networkfirewall")

    def test_load_aws_sdk_networkfirewall(self):
        self.gem_is_loadable("aws-sdk-networkfirewall")

