from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_train_rest(RubyGemsTestUtils):

    def test_gem_list_rubygems_train_rest(self):
        self.gem_is_installed("train-rest")

    def test_load_train_rest(self):
        self.gem_is_loadable("train-rest")

