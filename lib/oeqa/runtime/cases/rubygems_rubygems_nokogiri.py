from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_nokogiri(RubyGemsTestUtils):

    def test_gem_list_rubygems_nokogiri(self):
        self.gem_is_installed("nokogiri")

    def test_load_nokogiri(self):
        self.gem_is_loadable("nokogiri")

