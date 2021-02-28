from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_aws_sdk_secretsmanager(RubyGemsTestUtils):

    def test_gem_list_rubygems_aws_sdk_secretsmanager(self):
        self.gem_is_installed("aws-sdk-secretsmanager")

    def test_load_aws_sdk_secretsmanager(self):
        self.gem_is_loadable("aws-sdk-secretsmanager")

