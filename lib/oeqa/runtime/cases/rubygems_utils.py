from oeqa.runtime.case import OERuntimeTestCase
import sys

class RubyGemsTestUtils(OERuntimeTestCase):

    def gem_is_installed(self, gemname):
        status, output = self.target.run("GEM_PATH=/usr/lib/ruby/site_ruby:/usr/lib/ruby/gems gem list")
        sys.stderr.write(output + "\n")
        output = output.split("\n")
        self.assertTrue(any(x.startswith(gemname + " ") for x in output), msg="%s should be installed" % gemname)

    def gem_is_loadable(self, require):
        status, output = self.target.run("GEM_PATH=/usr/lib/ruby/site_ruby:/usr/lib/ruby/gems ruby -e 'require %s'" % require)
        sys.stderr.write(output + "\n")
        self.assertEquals(status, 0, msg="%s should be loadable" % require)
        