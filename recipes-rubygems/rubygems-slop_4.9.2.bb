# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: slop"
DESCRIPTION = "A DSL for gathering options and parsing command line flags"
HOMEPAGE = "http://github.com/leejarvis/slop"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=40575ded674b04c083ce6818c01f0282"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "718404ff0139d48b079e046037777723"
SRC_URI[sha256sum] = "5edcfaa749f3c978a7f8976520c8ec8aa174c3d5a1fcc52f05932eb7e442f2b5"

GEM_NAME = "slop"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
