from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_train_aws(RubyGemsTestUtils):

    def test_gem_list_rubygems_train_aws(self):
        self.gem_is_installed("train-aws")

    def test_load_train_aws(self):
        self.gem_is_loadable("train-aws")

