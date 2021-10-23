from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_aws_sdk_synthetics(RubyGemsTestUtils):

    def test_gem_list_rubygems_aws_sdk_synthetics(self):
        self.gem_is_installed("aws-sdk-synthetics")

    def test_load_aws_sdk_synthetics(self):
        self.gem_is_loadable("aws-sdk-synthetics")

