from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_aws_sdk_ram(RubyGemsTestUtils):

    def test_gem_list_rubygems_aws_sdk_ram(self):
        self.gem_is_installed("aws-sdk-ram")

    def test_load_aws_sdk_ram(self):
        self.gem_is_loadable("aws-sdk-ram")

