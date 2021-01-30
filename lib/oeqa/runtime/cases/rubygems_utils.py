from oeqa.runtime.case import OERuntimeTestCase

class RubyGemsTestUtils(OERuntimeTestCase):

    def gem_is_installed(self, gemname):
        status, output = self.target.run("gem list")
        output = output.split("\n")
        self.assertTrue(any(x.startswith(gemname) for x in output), msg="%s should be installed" % gemname)

    def gem_is_loadable(self, require):
        status, output = self.target.run("ruby -e 'require %s'" % require)
        self.assertEquals(status, 0, msg="%s should be loadable" % require)
        