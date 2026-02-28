from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_json_schema(RubyGemsTestUtils):

    def test_gem_list_rubygems_json_schema(self):
        self.gem_is_installed("json-schema")

    def test_load_json_schema(self):
        self.gem_is_loadable("json-schema")

