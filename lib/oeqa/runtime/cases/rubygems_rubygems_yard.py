from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_yard(RubyGemsTestUtils):

    def test_exec_yard(self):
        self.gem_exec_wrapper("yard")

    def test_exec_yard_lock(self):
        self.gem_exec_wrapper("yard.lock")

    def test_exec_yardoc(self):
        self.gem_exec_wrapper("yardoc")

    def test_exec_yardoc_lock(self):
        self.gem_exec_wrapper("yardoc.lock")

    def test_exec_yri(self):
        self.gem_exec_wrapper("yri")

    def test_exec_yri_lock(self):
        self.gem_exec_wrapper("yri.lock")

    def test_gem_list_rubygems_yard(self):
        self.gem_is_installed("yard")

    def test_load_rubygems_plugin(self):
        self.gem_is_loadable("rubygems_plugin")

    def test_load_yard(self):
        self.gem_is_loadable("yard")

