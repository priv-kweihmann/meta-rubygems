from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_json_schemer(RubyGemsTestUtils):

    def test_exec_json_schemer(self):
        self.gem_exec_wrapper("json_schemer")

    def test_gem_list_rubygems_json_schemer(self):
        self.gem_is_installed("json_schemer")

    def test_load_json_schemer(self):
        self.gem_is_loadable("json_schemer")

