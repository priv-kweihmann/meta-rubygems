from rubygems_utils import RubyGemsTestUtils
from oeqa.core.decorator.depends import OETestDepends

class RubyGemsTestruby_os(RubyGemsTestUtils):

    def test_gem_list_ruby_os(self):
        self.gem_is_installed("os")

    def test_load_os(self):
        self.gem_is_loadable("os")

