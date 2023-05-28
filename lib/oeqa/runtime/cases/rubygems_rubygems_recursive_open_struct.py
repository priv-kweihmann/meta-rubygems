from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_recursive_open_struct(RubyGemsTestUtils):

    def test_gem_list_rubygems_recursive_open_struct(self):
        self.gem_is_installed("recursive-open-struct")

    def test_load_recursive_open_struct(self):
        self.gem_is_loadable("recursive-open-struct")

    def test_load_recursive_open_struct(self):
        self.gem_is_loadable("recursive_open_struct")

