from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_aws_sdk_core(RubyGemsTestUtils):

    def test_gem_list_rubygems_aws_sdk_core(self):
        self.gem_is_installed("aws-sdk-core")

    def test_load_aws_defaults(self):
        self.gem_is_loadable("aws-defaults")

    def test_load_aws_sdk_core(self):
        self.gem_is_loadable("aws-sdk-core")

    def test_load_aws_sdk_sso(self):
        self.gem_is_loadable("aws-sdk-sso")

    def test_load_aws_sdk_sts(self):
        self.gem_is_loadable("aws-sdk-sts")

    def test_load_seahorse(self):
        self.gem_is_loadable("seahorse")

