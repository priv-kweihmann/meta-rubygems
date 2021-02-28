from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_azure_mgmt_security(RubyGemsTestUtils):

    def test_gem_list_rubygems_azure_mgmt_security(self):
        self.gem_is_installed("azure_mgmt_security")

    def test_load_azure_mgmt_security(self):
        self.gem_is_loadable("azure_mgmt_security")

    def test_load_module_definition(self):
        self.gem_is_loadable("module_definition")

    def test_load_version(self):
        self.gem_is_loadable("version")

