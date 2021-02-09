from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_aws_partitions(RubyGemsTestUtils):

    def test_gem_list_rubygems_aws_partitions(self):
        self.gem_is_installed("aws-partitions")

    def test_load_aws_partitions(self):
        self.gem_is_loadable("aws-partitions")

