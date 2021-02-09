from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_multipart_post(RubyGemsTestUtils):

    def test_gem_list_rubygems_multipart_post(self):
        self.gem_is_installed("multipart-post")

    def test_load_composite_io(self):
        self.gem_is_loadable("composite_io")

    def test_load_multipart_post(self):
        self.gem_is_loadable("multipart_post")

    def test_load_multipartable(self):
        self.gem_is_loadable("multipartable")

    def test_load_parts(self):
        self.gem_is_loadable("parts")

