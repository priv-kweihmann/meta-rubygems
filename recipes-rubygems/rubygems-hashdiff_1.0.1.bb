# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: hashdiff"
DESCRIPTION = "Hashdiff is a diff lib to compute the smallest difference between two hashes"
HOMEPAGE = "https://github.com/liufengyun/hashdiff"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=6c10cc38b516520cc860825a29852508"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "4e0e17a87b0ad7e132509495ba48cece"
SRC_URI[sha256sum] = "2cd4d04f5080314ecc8403c4e2e00dbaa282dff395e2d031bc16c8d501bdd6db"

GEM_NAME = "hashdiff"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
