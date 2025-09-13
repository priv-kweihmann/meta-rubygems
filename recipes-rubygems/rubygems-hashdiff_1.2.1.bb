# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: hashdiff"
DESCRIPTION = "Hashdiff is a diff lib to compute the smallest difference between two hashes"
HOMEPAGE = "https://github.com/liufengyun/hashdiff"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=6c10cc38b516520cc860825a29852508"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "7283eac101fc09917ef24972c187599c"
SRC_URI[sha256sum] = "9c079dbc513dfc8833ab59c0c2d8f230fa28499cc5efb4b8dd276cf931457cd1"

GEM_NAME = "hashdiff"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
