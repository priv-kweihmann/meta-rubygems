from oeqa.runtime.case import OERuntimeTestCase
from rubygems_exceptions import RubyGemsTestExceptions

gem_list = set()


class RubyGemsTestUtils(OERuntimeTestCase):

    def __gem_list(self):
        global gem_list
        if not gem_list:
            status, output = self.target.run("gem list")
            for line in output.split("\n"):
                if not line.strip():
                    continue
                gem_list.add(line.split(" ")[0])
        return gem_list

    def gem_is_installed(self, gemname):
        _skip = RubyGemsTestExceptions.gem_list_skips.get(gemname, '')
        if _skip:
            self.skipTest("'%s' skipped due to '%s'" % (gemname, _skip))
        self.assertTrue(gemname in self.__gem_list(),
                        msg="%s should be installed. Installed %s" % (gemname, ",".join(self.__gem_list())))

    def gem_is_loadable(self, require):
        _skip = RubyGemsTestExceptions.loadable_skips.get(require, '')
        if _skip:
            self.skipTest("'%s' skipped due to '%s'" % (require, _skip))
        _, _ = self.target.run(
            "echo \"require '%s'\" > /tmp/_rubygems.test" % require)
        status, output = self.target.run("ruby /tmp/_rubygems.test")
        self.assertEqual(
            status, 0, msg="%s should be loadable. ruby output: %s" % (require, output))

    def gem_exec_wrapper(self, _exec):
        _skip = RubyGemsTestExceptions.exec_wrapper_skips.get(_exec, '')
        if _skip:
            self.skipTest("'%s' skipped due to '%s'" % (_exec, _skip))
        _expret = RubyGemsTestExceptions.exec_wrapper_return_codes.get(
            _exec, 0)
        status, output = self.target.run("%s --help" % _exec)
        self.assertEqual(
            status, _expret, msg="%s exec is runnable. output: %s" % (_exec, output))
