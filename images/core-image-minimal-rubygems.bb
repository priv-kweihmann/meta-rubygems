require recipes-core/images/core-image-minimal.bb

inherit testimage

DESCRIPTION = "Image for testing rubygems. This automatically inherits all ruby recipes and testcases"
LICENSE = "MIT"

def rubygems_get_ruby_recipes(d):
    import glob
    res = set()
    for x in glob.glob(os.path.join(d.getVar("RUBYGEMS_LAYERDIR"), "recipes-rubygems", "*.bb")):
        _file, _ext = os.path.splitext(x)
        res.add(os.path.basename(_file).split("_")[0])
    return " ".join(res)

def rubygems_get_ruby_testcases(d):
    import glob
    res = set()
    for x in glob.glob(os.path.join(d.getVar("RUBYGEMS_LAYERDIR"), "lib/oeqa/runtime/cases", "rubygems_*.py")):
        _file, _ext = os.path.splitext(x)
        res.add(os.path.basename(_file))
    return " ".join(res)

IMAGE_INSTALL_append = "dropbear ${@rubygems_get_ruby_recipes(d)}"
DEFAULT_TEST_SUITES = "${@rubygems_get_ruby_testcases(d)}"

# Save a call by manually placing the dependency on the image
do_testimage[depends] += "${PN}:do_image_complete"
