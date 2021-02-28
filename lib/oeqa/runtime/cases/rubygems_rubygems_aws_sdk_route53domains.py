from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_aws_sdk_route53domains(RubyGemsTestUtils):

    def test_gem_list_rubygems_aws_sdk_route53domains(self):
        self.gem_is_installed("aws-sdk-route53domains")

    def test_load_aws_sdk_route53domains(self):
        self.gem_is_loadable("aws-sdk-route53domains")

