from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_aws_sdk_configservice(RubyGemsTestUtils):

    def test_gem_list_rubygems_aws_sdk_configservice(self):
        self.gem_is_installed("aws-sdk-configservice")

    def test_load_aws_sdk_configservice(self):
        self.gem_is_loadable("aws-sdk-configservice")

