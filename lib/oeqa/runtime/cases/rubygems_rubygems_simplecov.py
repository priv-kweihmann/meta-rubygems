from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_simplecov(RubyGemsTestUtils):

    def test_exec_simplecov(self):
        self.gem_exec_wrapper("simplecov")

    def test_gem_list_rubygems_simplecov(self):
        self.gem_is_installed("simplecov")

    def test_load_simplecov(self):
        self.gem_is_loadable("simplecov")

    def test_load_simplecov_html(self):
        self.gem_is_loadable("simplecov-html")

    def test_load_simplecov_json_formatter(self):
        self.gem_is_loadable("simplecov_json_formatter")

