from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_retriable(RubyGemsTestUtils):

    def test_gem_list_rubygems_retriable(self):
        self.gem_is_installed("retriable")

    def test_load_retriable(self):
        self.gem_is_loadable("retriable")

