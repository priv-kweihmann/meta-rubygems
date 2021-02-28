from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_aws_sdk_budgets(RubyGemsTestUtils):

    def test_gem_list_rubygems_aws_sdk_budgets(self):
        self.gem_is_installed("aws-sdk-budgets")

    def test_load_aws_sdk_budgets(self):
        self.gem_is_loadable("aws-sdk-budgets")

