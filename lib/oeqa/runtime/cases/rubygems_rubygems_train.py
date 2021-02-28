from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_train(RubyGemsTestUtils):

    def test_gem_list_rubygems_train(self):
        self.gem_is_installed("train")

