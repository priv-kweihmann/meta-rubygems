from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_bundler(RubyGemsTestUtils):

    def test_exec_bundle(self):
        self.gem_exec_wrapper("bundle")

    def test_exec_bundler(self):
        self.gem_exec_wrapper("bundler")

    def test_gem_list_rubygems_bundler(self):
        self.gem_is_installed("bundler")

    def test_load_bundler(self):
        self.gem_is_loadable("bundler")

