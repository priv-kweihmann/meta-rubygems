from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_aws_sdk_elasticsearchservice(RubyGemsTestUtils):

    def test_gem_list_rubygems_aws_sdk_elasticsearchservice(self):
        self.gem_is_installed("aws-sdk-elasticsearchservice")

    def test_load_aws_sdk_elasticsearchservice(self):
        self.gem_is_loadable("aws-sdk-elasticsearchservice")

