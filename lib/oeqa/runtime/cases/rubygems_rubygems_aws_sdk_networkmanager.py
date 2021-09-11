from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_aws_sdk_networkmanager(RubyGemsTestUtils):

    def test_gem_list_rubygems_aws_sdk_networkmanager(self):
        self.gem_is_installed("aws-sdk-networkmanager")

    def test_load_aws_sdk_networkmanager(self):
        self.gem_is_loadable("aws-sdk-networkmanager")

