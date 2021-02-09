from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_hocon(RubyGemsTestUtils):

    def test_exec_hocon(self):
        self.gem_exec_wrapper("hocon")

    def test_gem_list_rubygems_hocon(self):
        self.gem_is_installed("hocon")

    def test_load_hocon(self):
        self.gem_is_loadable("hocon")

