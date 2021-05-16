from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_listen(RubyGemsTestUtils):

    def test_exec_listen(self):
        self.gem_exec_wrapper("listen")

    def test_gem_list_rubygems_listen(self):
        self.gem_is_installed("listen")

    def test_load_listen(self):
        self.gem_is_loadable("listen")

