from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_sqlite3(RubyGemsTestUtils):

    def test_gem_list_rubygems_sqlite3(self):
        self.gem_is_installed("sqlite3")

    def test_load_sqlite3(self):
        self.gem_is_loadable("sqlite3")
