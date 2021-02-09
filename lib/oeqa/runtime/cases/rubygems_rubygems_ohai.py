from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_ohai(RubyGemsTestUtils):

    def test_exec_ohai(self):
        self.gem_exec_wrapper("ohai")

    def test_gem_list_rubygems_ohai(self):
        self.gem_is_installed("ohai")

    def test_load_ohai(self):
        self.gem_is_loadable("ohai")

