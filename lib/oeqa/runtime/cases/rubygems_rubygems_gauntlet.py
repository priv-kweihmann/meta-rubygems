from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_gauntlet(RubyGemsTestUtils):

    def test_exec_gauntlet(self):
        self.gem_exec_wrapper("gauntlet")

    def test_exec_gauntlet_lock(self):
        self.gem_exec_wrapper("gauntlet.lock")

    def test_gem_list_rubygems_gauntlet(self):
        self.gem_is_installed("gauntlet")

    def test_load_gauntlet(self):
        self.gem_is_loadable("gauntlet")

    def test_load_gauntlet_grep(self):
        self.gem_is_loadable("gauntlet_grep")

