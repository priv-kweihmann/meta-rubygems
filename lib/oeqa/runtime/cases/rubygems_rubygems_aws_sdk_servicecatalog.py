from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_aws_sdk_servicecatalog(RubyGemsTestUtils):

    def test_gem_list_rubygems_aws_sdk_servicecatalog(self):
        self.gem_is_installed("aws-sdk-servicecatalog")

    def test_load_aws_sdk_servicecatalog(self):
        self.gem_is_loadable("aws-sdk-servicecatalog")

