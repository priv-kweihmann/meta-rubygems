from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_flog(RubyGemsTestUtils):

    def test_exec_flog(self):
        self.gem_exec_wrapper("flog")

    def test_gem_list_rubygems_flog(self):
        self.gem_is_installed("flog")

    def test_load_flog(self):
        self.gem_is_loadable("flog")

    def test_load_flog_cli(self):
        self.gem_is_loadable("flog_cli")

    def test_load_flog_task(self):
        self.gem_is_loadable("flog_task")

    def test_load_gauntlet_flog(self):
        self.gem_is_loadable("gauntlet_flog")

