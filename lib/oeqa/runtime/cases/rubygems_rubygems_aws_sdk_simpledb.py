from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_aws_sdk_simpledb(RubyGemsTestUtils):

    def test_gem_list_rubygems_aws_sdk_simpledb(self):
        self.gem_is_installed("aws-sdk-simpledb")

    def test_load_aws_sdk_simpledb(self):
        self.gem_is_loadable("aws-sdk-simpledb")

