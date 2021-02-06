from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_serverspec(RubyGemsTestUtils):

    def test_exec_serverspec_init(self):
        self.gem_exec_wrapper("serverspec-init")

    def test_gem_list_rubygems_serverspec(self):
        self.gem_is_installed("serverspec")

    def test_load_serverspec(self):
        self.gem_is_loadable("serverspec")

