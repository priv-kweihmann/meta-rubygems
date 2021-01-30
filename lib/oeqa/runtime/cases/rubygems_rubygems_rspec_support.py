from rubygems_utils import RubyGemsTestUtils
from oeqa.core.decorator.depends import OETestDepends

class RubyGemsTestrubygems_rspec_support(RubyGemsTestUtils):

    def test_gem_list_rubygems_rspec_support(self):
        self.gem_is_installed("rspec-support")

