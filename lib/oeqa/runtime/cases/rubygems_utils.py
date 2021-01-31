from oeqa.runtime.case import OERuntimeTestCase
import sys


class RubyGemsTestUtils(OERuntimeTestCase):

    def gem_is_installed(self, gemname):
        status, output = self.target.run("gem list")
        sys.stderr.write(output + "\n")
        output = output.split("\n")
        self.assertTrue(any(x.startswith(gemname + " ") for x in output), 
                        msg="%s should be installed. Installed %s" % (gemname, ",".join(output)))

    def gem_is_loadable(self, require):
        _, _=self.target.run(
            "echo \"require '%s'\" > /tmp/_rubygems.test" % require)
        status, output=self.target.run("ruby /tmp/_rubygems.test")
        self.assertEquals(status, 0, msg="%s should be loadable. ruby output: %s" % (require, output))
