from oeqa.runtime.case import OERuntimeTestCase
from rubygems_exceptions import RubyGemsTestExceptions
import sys


class RubyGemsTestUtils(OERuntimeTestCase):

    def gem_is_installed(self, gemname):
        _skip = RubyGemsTestExceptions.gem_list_skips(gemname, '')
        if _skip:
            self.skipTest("'%s' due to '%s'" % (gemname, _skip))
        status, output = self.target.run("gem list")
        sys.stderr.write(output + "\n")
        output = output.split("\n")
        self.assertTrue(any(x.startswith(gemname + " ") for x in output), 
                        msg="%s should be installed. Installed %s" % (gemname, ",".join(output)))

    def gem_is_loadable(self, require):
        _skip = RubyGemsTestExceptions.loadable_skips(require, '')
        if _skip:
            self.skipTest("'%s' due to '%s'" % (require, _skip))
        _, _ = self.target.run("echo \"require '%s'\" > /tmp/_rubygems.test" % require)
        status, output = self.target.run("ruby /tmp/_rubygems.test")
        self.assertEquals(status, 0, msg="%s should be loadable. ruby output: %s" % (require, output))

    def gem_exec_wrapper(self, _exec):
        _skip = RubyGemsTestExceptions.exec_wrapper_skips(_exec, '')
        if _skip:
            self.skipTest("'%s' due to '%s'" % (_exec, _skip))
        _expret = RubyGemsTestExceptions.exec_wrapper_return_codes.get(_exec, 0)
        status, output = self.target.run("%s --help" % _exec)
        self.assertEquals(status, _expret, msg="%s exec is runnable. output: %s" % (_exec, output))
