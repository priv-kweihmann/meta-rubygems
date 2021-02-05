from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_coderay(RubyGemsTestUtils):

    def test_exec_coderay(self):
        self.gem_exec_wrapper("coderay")

    def test_gem_list_rubygems_coderay(self):
        self.gem_is_installed("coderay")

    def test_load_coderay(self):
        self.gem_is_loadable("coderay")

