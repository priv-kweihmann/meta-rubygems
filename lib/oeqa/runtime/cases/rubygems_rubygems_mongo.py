from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_mongo(RubyGemsTestUtils):

    def test_exec_mongo_console(self):
        self.gem_exec_wrapper("mongo_console")

    def test_gem_list_rubygems_mongo(self):
        self.gem_is_installed("mongo")

    def test_load_mongo(self):
        self.gem_is_loadable("mongo")

