from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_mime_types_data(RubyGemsTestUtils):

    def test_gem_list_rubygems_mime_types_data(self):
        self.gem_is_installed("mime-types-data")

    def test_load_mime_types_data(self):
        self.gem_is_loadable("mime-types-data")

