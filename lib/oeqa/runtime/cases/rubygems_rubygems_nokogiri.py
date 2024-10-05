from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_nokogiri(RubyGemsTestUtils):

    def test_exec_nokogiri(self):
        self.gem_exec_wrapper("nokogiri")

    def test_exec_nokogiri_lock(self):
        self.gem_exec_wrapper("nokogiri.lock")

    def test_gem_list_rubygems_nokogiri(self):
        self.gem_is_installed("nokogiri")

    def test_load_nokogiri(self):
        self.gem_is_loadable("nokogiri")

