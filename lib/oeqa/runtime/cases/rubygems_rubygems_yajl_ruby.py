from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_yajl_ruby(RubyGemsTestUtils):

    def test_gem_list_rubygems_yajl_ruby(self):
        self.gem_is_installed("yajl-ruby")

    def test_load_yajl(self):
        self.gem_is_loadable("yajl")

