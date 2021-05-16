from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_safe_yaml(RubyGemsTestUtils):

    def test_exec_safe_yaml(self):
        self.gem_exec_wrapper("safe_yaml")

    def test_gem_list_rubygems_safe_yaml(self):
        self.gem_is_installed("safe_yaml")

    def test_load_safe_yaml(self):
        self.gem_is_loadable("safe_yaml")

