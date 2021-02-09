from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_rspec_junit_formatter(RubyGemsTestUtils):

    def test_gem_list_rubygems_rspec_junit_formatter(self):
        self.gem_is_installed("rspec_junit_formatter")

    def test_load_rspec_junit_formatter(self):
        self.gem_is_loadable("rspec_junit_formatter")

