from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_puppet(RubyGemsTestUtils):

    def test_exec_puppet(self):
        self.gem_exec_wrapper("puppet")

    def test_gem_list_rubygems_puppet(self):
        self.gem_is_installed("puppet")

    def test_load_hiera_puppet(self):
        self.gem_is_loadable("hiera_puppet")

    def test_load_puppet(self):
        self.gem_is_loadable("puppet")

    def test_load_puppet_pal(self):
        self.gem_is_loadable("puppet_pal")

    def test_load_puppet_x(self):
        self.gem_is_loadable("puppet_x")

