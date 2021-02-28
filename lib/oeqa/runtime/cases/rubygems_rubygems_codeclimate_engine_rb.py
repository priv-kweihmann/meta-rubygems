from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_codeclimate_engine_rb(RubyGemsTestUtils):

    def test_gem_list_rubygems_codeclimate_engine_rb(self):
        self.gem_is_installed("codeclimate-engine-rb")

    def test_load_codeclimate_engine(self):
        self.gem_is_loadable("codeclimate_engine")

