from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_aws_sdk_route53resolver(RubyGemsTestUtils):

    def test_gem_list_rubygems_aws_sdk_route53resolver(self):
        self.gem_is_installed("aws-sdk-route53resolver")

    def test_load_aws_sdk_route53resolver(self):
        self.gem_is_loadable("aws-sdk-route53resolver")

