from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_flay(RubyGemsTestUtils):

    def test_exec_flay(self):
        self.gem_exec_wrapper("flay")

    def test_gem_list_rubygems_flay(self):
        self.gem_is_installed("flay")

    def test_load_flay(self):
        self.gem_is_loadable("flay")

    def test_load_flay_erb(self):
        self.gem_is_loadable("flay_erb")

    def test_load_flay_task(self):
        self.gem_is_loadable("flay_task")

    def test_load_gauntlet_flay(self):
        self.gem_is_loadable("gauntlet_flay")

