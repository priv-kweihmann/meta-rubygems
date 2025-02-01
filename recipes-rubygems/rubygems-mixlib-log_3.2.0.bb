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

SRC_URI[md5sum] = "2ff4dab4194d03950d8115f964ef66b4"
SRC_URI[sha256sum] = "c2be9f5defe171f163dadc8b0de84b7e98b36e4c0019750c0bbbcee958894a18"

GEM_NAME = "mixlib-log"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-ffi \
"

BBCLASSEXTEND = "native"
