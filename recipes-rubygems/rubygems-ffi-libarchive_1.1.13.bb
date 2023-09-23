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

SRC_URI[md5sum] = "eec2820d595efaa43c23966c08c2ae86"
SRC_URI[sha256sum] = "ce7c5a927b0ad5de38d5b06b639f724466ec865c26e8f9a9ab4fb80295dfbb6f"

GEM_NAME = "ffi-libarchive"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-ffi \
"

BBCLASSEXTEND = "native"
