from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_rb_inotify(RubyGemsTestUtils):

    def test_gem_list_rubygems_rb_inotify(self):
        self.gem_is_installed("rb-inotify")

    def test_load_rb_inotify(self):
        self.gem_is_loadable("rb-inotify")

