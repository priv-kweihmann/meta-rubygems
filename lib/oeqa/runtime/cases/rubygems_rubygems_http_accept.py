from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_http_accept(RubyGemsTestUtils):

    def test_gem_list_rubygems_http_accept(self):
        self.gem_is_installed("http-accept")

