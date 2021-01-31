from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_aws_eventstream(RubyGemsTestUtils):

    def test_gem_list_rubygems_aws_eventstream(self):
        self.gem_is_installed("aws-eventstream")

    def test_load_aws_eventstream(self):
        self.gem_is_loadable("aws-eventstream")

