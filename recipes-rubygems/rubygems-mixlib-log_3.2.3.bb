# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: mixlib-log"
DESCRIPTION = "A gem that provides a simple mixin for log functionality"
HOMEPAGE = "https://github.com/chef/mixlib-log"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=8f7bb094c7232b058c7e9f2e431f389c"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

DEPENDS:class-native += "\
    rubygems-ffi-native \
"

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "eef67df7266352021b486ef9504c83d6"
SRC_URI[sha256sum] = "2a1d3fa83522a320edd493827c901b773fb5d185fac7efd81d028d8e1166a768"

GEM_NAME = "mixlib-log"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-ffi \
"

BBCLASSEXTEND = "native"
