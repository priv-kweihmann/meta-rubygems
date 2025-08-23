from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_socksify(RubyGemsTestUtils):

    def test_exec_socksify_ruby(self):
        self.gem_exec_wrapper("socksify_ruby")

    def test_gem_list_rubygems_socksify(self):
        self.gem_is_installed("socksify")

    def test_load_socksify(self):
        self.gem_is_loadable("socksify")

