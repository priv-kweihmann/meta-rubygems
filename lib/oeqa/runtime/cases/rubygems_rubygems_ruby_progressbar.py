from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_ruby_progressbar(RubyGemsTestUtils):

    def test_gem_list_rubygems_ruby_progressbar(self):
        self.gem_is_installed("ruby-progressbar")

    def test_load_ruby_progressbar(self):
        self.gem_is_loadable("ruby-progressbar")

