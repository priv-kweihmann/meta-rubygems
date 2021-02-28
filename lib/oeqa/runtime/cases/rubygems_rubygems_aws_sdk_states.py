from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_aws_sdk_states(RubyGemsTestUtils):

    def test_gem_list_rubygems_aws_sdk_states(self):
        self.gem_is_installed("aws-sdk-states")

    def test_load_aws_sdk_states(self):
        self.gem_is_loadable("aws-sdk-states")

