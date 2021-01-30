from rubygems_utils import RubyGemsTestUtils
from oeqa.core.decorator.depends import OETestDepends

class RubyGemsTestrubygems_rspec(RubyGemsTestUtils):

    def test_gem_list_rubygems_rspec(self):
        self.gem_is_installed("rspec")

    def test_load_rspec(self):
        self.gem_is_loadable("rspec")

