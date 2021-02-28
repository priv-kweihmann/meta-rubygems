from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_azure_graph_rbac(RubyGemsTestUtils):

    def test_gem_list_rubygems_azure_graph_rbac(self):
        self.gem_is_installed("azure_graph_rbac")

    def test_load_azure_graph_rbac(self):
        self.gem_is_loadable("azure_graph_rbac")

    def test_load_module_definition(self):
        self.gem_is_loadable("module_definition")

    def test_load_version(self):
        self.gem_is_loadable("version")

