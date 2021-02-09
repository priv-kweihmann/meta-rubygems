from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_mime_types(RubyGemsTestUtils):

    def test_gem_list_rubygems_mime_types(self):
        self.gem_is_installed("mime-types")

    def test_load_mime_types(self):
        self.gem_is_loadable("mime-types")

