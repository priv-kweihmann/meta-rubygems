# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: ffi-libarchive"
DESCRIPTION = "A Ruby FFI binding to libarchive."
HOMEPAGE = "https://github.com/chef/ffi-libarchive"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=8f7bb094c7232b058c7e9f2e431f389c"

EXTRA_DEPENDS:append = " \
    libarchive \
"
EXTRA_RDEPENDS:append = " \
    libarchive \
"

DEPENDS:class-native += "\
    rubygems-ffi-native \
"

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "81b8896dfdbbfdc5d9b4d3de902b9cf3"
SRC_URI[sha256sum] = "41be182035a09e04fac5928f65794f9adf60eb8e0a36002fb6575457bcb6dd3f"

GEM_NAME = "ffi-libarchive"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-ffi \
"

BBCLASSEXTEND = "native"
