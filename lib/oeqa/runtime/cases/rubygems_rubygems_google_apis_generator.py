from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_google_apis_generator(RubyGemsTestUtils):

    def test_exec_generate_api(self):
        self.gem_exec_wrapper("generate-api")

    def test_gem_list_rubygems_google_apis_generator(self):
        self.gem_is_installed("google-apis-generator")

