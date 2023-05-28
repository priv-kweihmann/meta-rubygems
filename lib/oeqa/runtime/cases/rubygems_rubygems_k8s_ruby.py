from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_k8s_ruby(RubyGemsTestUtils):

    def test_gem_list_rubygems_k8s_ruby(self):
        self.gem_is_installed("k8s-ruby")

    def test_load_k8s_ruby(self):
        self.gem_is_loadable("k8s-ruby")

