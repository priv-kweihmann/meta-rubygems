from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_azure_mgmt_resources(RubyGemsTestUtils):

    def test_gem_list_rubygems_azure_mgmt_resources(self):
        self.gem_is_installed("azure_mgmt_resources")

    def test_load_azure_mgmt_resources(self):
        self.gem_is_loadable("azure_mgmt_resources")

    def test_load_module_definition(self):
        self.gem_is_loadable("module_definition")

    def test_load_version(self):
        self.gem_is_loadable("version")

