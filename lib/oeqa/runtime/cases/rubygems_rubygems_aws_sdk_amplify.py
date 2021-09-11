from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_aws_sdk_amplify(RubyGemsTestUtils):

    def test_gem_list_rubygems_aws_sdk_amplify(self):
        self.gem_is_installed("aws-sdk-amplify")

    def test_load_aws_sdk_amplify(self):
        self.gem_is_loadable("aws-sdk-amplify")

