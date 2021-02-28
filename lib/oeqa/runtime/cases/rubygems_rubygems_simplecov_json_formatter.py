from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_simplecov_json_formatter(RubyGemsTestUtils):

    def test_gem_list_rubygems_simplecov_json_formatter(self):
        self.gem_is_installed("simplecov_json_formatter")

    def test_load_simplecov_json_formatter(self):
        self.gem_is_loadable("simplecov_json_formatter")

