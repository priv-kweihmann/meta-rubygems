# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: hashdiff"
DESCRIPTION = "Hashdiff is a diff lib to compute the smallest difference between two hashes"
HOMEPAGE = "https://github.com/liufengyun/hashdiff"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=6c10cc38b516520cc860825a29852508"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "9632271e67c51e2abece150e5dd5d63f"
SRC_URI[sha256sum] = "c984f13e115bfc9953332e8e83bd9d769cfde9944e2d54e07eb9df7b76e140b5"

GEM_NAME = "hashdiff"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
