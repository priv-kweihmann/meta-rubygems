from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_rubyzip(RubyGemsTestUtils):

    def test_gem_list_rubygems_rubyzip(self):
        self.gem_is_installed("rubyzip")

    def test_load_zip(self):
        self.gem_is_loadable("zip")

