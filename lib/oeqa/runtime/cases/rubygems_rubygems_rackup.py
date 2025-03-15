from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_rackup(RubyGemsTestUtils):

    def test_exec_rackup(self):
        self.gem_exec_wrapper("rackup")

    def test_gem_list_rubygems_rackup(self):
        self.gem_is_installed("rackup")

    def test_load_rackup(self):
        self.gem_is_loadable("rackup")

