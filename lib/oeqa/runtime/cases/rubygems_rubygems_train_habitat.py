from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_train_habitat(RubyGemsTestUtils):

    def test_gem_list_rubygems_train_habitat(self):
        self.gem_is_installed("train-habitat")

    def test_load_train_habitat(self):
        self.gem_is_loadable("train-habitat")

