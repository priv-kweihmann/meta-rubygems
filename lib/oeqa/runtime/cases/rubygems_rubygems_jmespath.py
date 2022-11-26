from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_jmespath(RubyGemsTestUtils):

    def test_exec_jmespath_rb(self):
        self.gem_exec_wrapper("jmespath.rb")

    def test_gem_list_rubygems_jmespath(self):
        self.gem_is_installed("jmespath")

    def test_load_jmespath(self):
        self.gem_is_loadable("jmespath")

