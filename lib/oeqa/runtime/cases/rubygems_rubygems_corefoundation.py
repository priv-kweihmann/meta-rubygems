from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_corefoundation(RubyGemsTestUtils):

    def test_gem_list_rubygems_corefoundation(self):
        self.gem_is_installed("corefoundation")

    def test_load_corefoundation(self):
        self.gem_is_loadable("corefoundation")

