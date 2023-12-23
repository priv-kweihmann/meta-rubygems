from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_aws_sdk_accessanalyzer(RubyGemsTestUtils):

    def test_gem_list_rubygems_aws_sdk_accessanalyzer(self):
        self.gem_is_installed("aws-sdk-accessanalyzer")

    def test_load_aws_sdk_accessanalyzer(self):
        self.gem_is_loadable("aws-sdk-accessanalyzer")

