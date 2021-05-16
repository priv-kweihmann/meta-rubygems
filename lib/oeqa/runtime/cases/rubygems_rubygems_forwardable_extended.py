from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_forwardable_extended(RubyGemsTestUtils):

    def test_gem_list_rubygems_forwardable_extended(self):
        self.gem_is_installed("forwardable-extended")

