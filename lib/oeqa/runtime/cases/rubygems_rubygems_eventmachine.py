from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_eventmachine(RubyGemsTestUtils):

    def test_gem_list_rubygems_eventmachine(self):
        self.gem_is_installed("eventmachine")

    def test_load_eventmachine(self):
        self.gem_is_loadable("eventmachine")

    def test_load_jeventmachine(self):
        self.gem_is_loadable("jeventmachine")

