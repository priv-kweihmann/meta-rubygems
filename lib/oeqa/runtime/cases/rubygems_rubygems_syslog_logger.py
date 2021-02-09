from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_syslog_logger(RubyGemsTestUtils):

    def test_gem_list_rubygems_syslog_logger(self):
        self.gem_is_installed("syslog-logger")

    def test_load_syslog_formatter(self):
        self.gem_is_loadable("syslog-formatter")

    def test_load_syslog_logger(self):
        self.gem_is_loadable("syslog-logger")

