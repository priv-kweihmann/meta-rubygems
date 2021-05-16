from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_rouge(RubyGemsTestUtils):

    def test_exec_rougify(self):
        self.gem_exec_wrapper("rougify")

    def test_gem_list_rubygems_rouge(self):
        self.gem_is_installed("rouge")

    def test_load_rouge(self):
        self.gem_is_loadable("rouge")

