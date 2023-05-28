from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_jsonpath(RubyGemsTestUtils):

    def test_exec_jsonpath(self):
        self.gem_exec_wrapper("jsonpath")

    def test_gem_list_rubygems_jsonpath(self):
        self.gem_is_installed("jsonpath")

    def test_load_jsonpath(self):
        self.gem_is_loadable("jsonpath")

