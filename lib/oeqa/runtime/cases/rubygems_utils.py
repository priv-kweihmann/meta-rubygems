from oeqa.runtime.case import OERuntimeTestCase
import sys


class RubyGemsTestUtils(OERuntimeTestCase):

    EXEC_EXCEPTIONS = {
        "htmldiff": 127,
        "rwinrm": 1,
        "rwinrmcp": 1
    }

    def gem_is_installed(self, gemname):
        status, output = self.target.run("gem list")
        sys.stderr.write(output + "\n")
        output = output.split("\n")
        self.assertTrue(any(x.startswith(gemname + " ") for x in output), 
                        msg="%s should be installed. Installed %s" % (gemname, ",".join(output)))

    def gem_is_loadable(self, require):
        _, _ = self.target.run("echo \"require '%s'\" > /tmp/_rubygems.test" % require)
        status, output = self.target.run("ruby /tmp/_rubygems.test")
        self.assertEquals(status, 0, msg="%s should be loadable. ruby output: %s" % (require, output))

    def gem_exec_wrapper(self, _exec):
        _expret = RubyGemsTestUtils.EXEC_EXCEPTIONS.get(_exec, 0)
        status, output = self.target.run("%s --help" % _exec)
        self.assertEquals(status, _expret, msg="%s exec is runnable. output: %s" % (_exec, output))
