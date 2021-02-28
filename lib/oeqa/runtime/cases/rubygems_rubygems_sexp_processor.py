from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_sexp_processor(RubyGemsTestUtils):

    def test_gem_list_rubygems_sexp_processor(self):
        self.gem_is_installed("sexp_processor")

    def test_load_composite_sexp_processor(self):
        self.gem_is_loadable("composite_sexp_processor")

    def test_load_pt_testcase(self):
        self.gem_is_loadable("pt_testcase")

    def test_load_sexp(self):
        self.gem_is_loadable("sexp")

    def test_load_sexp_matcher(self):
        self.gem_is_loadable("sexp_matcher")

    def test_load_sexp_processor(self):
        self.gem_is_loadable("sexp_processor")

    def test_load_strict_sexp(self):
        self.gem_is_loadable("strict_sexp")

    def test_load_unique(self):
        self.gem_is_loadable("unique")

