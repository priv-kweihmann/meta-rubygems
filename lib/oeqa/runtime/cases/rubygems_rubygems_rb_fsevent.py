from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_rb_fsevent(RubyGemsTestUtils):

    def test_gem_list_rubygems_rb_fsevent(self):
        self.gem_is_installed("rb-fsevent")

    def test_load_otnetstring(self):
        self.gem_is_loadable("otnetstring")

    def test_load_rb_fsevent(self):
        self.gem_is_loadable("rb-fsevent")

