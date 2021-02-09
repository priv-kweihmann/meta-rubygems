from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_concurrent_ruby(RubyGemsTestUtils):

    def test_gem_list_rubygems_concurrent_ruby(self):
        self.gem_is_installed("concurrent-ruby")

