from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_bcrypt_pbkdf(RubyGemsTestUtils):

    def test_gem_list_rubygems_bcrypt_pbkdf(self):
        self.gem_is_installed("bcrypt_pbkdf")

    def test_load_bcrypt_pbkdf(self):
        self.gem_is_loadable("bcrypt_pbkdf")

