from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_puppet_resource_api(RubyGemsTestUtils):

    def test_gem_list_rubygems_puppet_resource_api(self):
        self.gem_is_installed("puppet-resource_api")

