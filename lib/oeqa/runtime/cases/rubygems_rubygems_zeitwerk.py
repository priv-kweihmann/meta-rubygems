from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_zeitwerk(RubyGemsTestUtils):

    def test_gem_list_rubygems_zeitwerk(self):
        self.gem_is_installed("zeitwerk")

    def test_load_zeitwerk(self):
        self.gem_is_loadable("zeitwerk")

