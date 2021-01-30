from rubygems_utils import RubyGemsTestUtils
from oeqa.core.decorator.depends import OETestDepends

class RubyGemsTestruby_fuzzyurl(RubyGemsTestUtils):

    def test_gem_list_ruby_fuzzyurl(self):
        self.gem_is_installed("fuzzyurl")

    def test_load_fuzzyurl(self):
        self.gem_is_loadable("fuzzyurl")

