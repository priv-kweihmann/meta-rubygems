from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_thread_safe(RubyGemsTestUtils):

    def test_gem_list_rubygems_thread_safe(self):
        self.gem_is_installed("thread_safe")

    def test_load_thread_safe(self):
        self.gem_is_loadable("thread_safe")

