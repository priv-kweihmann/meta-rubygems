# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: ffi-libarchive"
DESCRIPTION = "A Ruby FFI binding to libarchive."
HOMEPAGE = "https://github.com/chef/ffi-libarchive"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=8f7bb094c7232b058c7e9f2e431f389c"

EXTRA_DEPENDS += "\
    libarchive \
"

EXTRA_RDEPENDS += "\
    libarchive \
"

DEPENDS:class-native += "\
    rubygems-ffi-native \
"

SRC_URI[md5sum] = "1236765aa4244cef2082cfa1d2655504"
SRC_URI[sha256sum] = "7db625d98f2aada6c20f7a6180909fe4f18e9415b84d3d5841b9e708cde3abf2"

GEM_NAME = "ffi-libarchive"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-ffi \
"

BBCLASSEXTEND = "native"
