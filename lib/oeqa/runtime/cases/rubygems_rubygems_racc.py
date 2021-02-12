from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_racc(RubyGemsTestUtils):

    def test_exec_racc(self):
        self.gem_exec_wrapper("racc")

    def test_gem_list_rubygems_racc(self):
        self.gem_is_installed("racc")

    def test_load_racc(self):
        self.gem_is_loadable("racc")

