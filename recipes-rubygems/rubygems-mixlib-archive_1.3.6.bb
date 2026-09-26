# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: mixlib-archive"
DESCRIPTION = "A simple interface to various archive formats"
HOMEPAGE = "https://github.com/chef/mixlib-archive"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=8f7bb094c7232b058c7e9f2e431f389c"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

DEPENDS:class-native += "\
    rubygems-mixlib-log-native \
"

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "e3eca1e3ed78bd552983b6fd0f0da28c"
SRC_URI[sha256sum] = "68c435717b75391b5a048a887600f693709887bced0f9764ef14cc3c8dbd5b1c"

GEM_NAME = "mixlib-archive"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-mixlib-log \
"

BBCLASSEXTEND = "native"
