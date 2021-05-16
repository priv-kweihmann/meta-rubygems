from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_kramdown(RubyGemsTestUtils):

    def test_exec_kramdown(self):
        self.gem_exec_wrapper("kramdown")

    def test_gem_list_rubygems_kramdown(self):
        self.gem_is_installed("kramdown")

    def test_load_kramdown(self):
        self.gem_is_loadable("kramdown")

