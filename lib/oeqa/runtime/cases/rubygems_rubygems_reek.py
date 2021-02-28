from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_reek(RubyGemsTestUtils):

    def test_exec_code_climate_reek(self):
        self.gem_exec_wrapper("code_climate_reek")

    def test_exec_reek(self):
        self.gem_exec_wrapper("reek")

    def test_gem_list_rubygems_reek(self):
        self.gem_is_installed("reek")

    def test_load_reek(self):
        self.gem_is_loadable("reek")

