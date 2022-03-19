from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_progress_bar(RubyGemsTestUtils):

    def test_gem_list_rubygems_progress_bar(self):
        self.gem_is_installed("progress_bar")

    def test_load_progress_bar(self):
        self.gem_is_loadable("progress_bar")

