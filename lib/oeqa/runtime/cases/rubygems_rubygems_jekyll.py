from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_jekyll(RubyGemsTestUtils):

    def test_exec_jekyll(self):
        self.gem_exec_wrapper("jekyll")

    def test_gem_list_rubygems_jekyll(self):
        self.gem_is_installed("jekyll")

    def test_load_jekyll(self):
        self.gem_is_loadable("jekyll")

