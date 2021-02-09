from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_chef_telemetry(RubyGemsTestUtils):

    def test_gem_list_rubygems_chef_telemetry(self):
        self.gem_is_installed("chef-telemetry")

