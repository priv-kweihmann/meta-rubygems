from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_kwalify(RubyGemsTestUtils):

    def test_exec_kwalify(self):
        self.gem_exec_wrapper("kwalify")

    def test_gem_list_rubygems_kwalify(self):
        self.gem_is_installed("kwalify")

    def test_load_kwalify(self):
        self.gem_is_loadable("kwalify")

