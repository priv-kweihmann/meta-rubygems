from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_train_kubernetes(RubyGemsTestUtils):

    def test_gem_list_rubygems_train_kubernetes(self):
        self.gem_is_installed("train-kubernetes")

    def test_load_train_kubernetes(self):
        self.gem_is_loadable("train-kubernetes")

