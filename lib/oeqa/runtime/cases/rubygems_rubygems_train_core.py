from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_train_core(RubyGemsTestUtils):

    def test_gem_list_rubygems_train_core(self):
        self.gem_is_installed("train-core")

    def test_load_train(self):
        self.gem_is_loadable("train")

