from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_aws_sdk_elasticbeanstalk(RubyGemsTestUtils):

    def test_gem_list_rubygems_aws_sdk_elasticbeanstalk(self):
        self.gem_is_installed("aws-sdk-elasticbeanstalk")

    def test_load_aws_sdk_elasticbeanstalk(self):
        self.gem_is_loadable("aws-sdk-elasticbeanstalk")

