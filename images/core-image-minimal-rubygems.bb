require recipes-core/images/core-image-minimal.bb

inherit testimage

DESCRIPTION = "Image for testing rubygems. This automatically inherits all ruby recipes and testcases"
LICENSE = "MIT"

def rubygems_get_ruby_testcases(d):
    import glob
    res = set()
    for x in glob.glob(os.path.join(d.getVar("RUBYGEMS_LAYERDIR"), "lib/oeqa/runtime/cases", "rubygems_*.py")):
        _file, _ext = os.path.splitext(x)
        res.add(os.path.basename(_file))
    return " ".join(res)

IMAGE_INSTALL_append = " dropbear packagegroup-rubygems"
RUBYGEMS_TEST_SUITE ?= "${@rubygems_get_ruby_testcases(d)}"
DEFAULT_TEST_SUITES = "${RUBYGEMS_TEST_SUITE}"

# Save a call by manually placing the dependency on the image
do_testimage[depends] += "${PN}:do_image_complete"
