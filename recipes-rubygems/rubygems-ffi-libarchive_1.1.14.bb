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

SRC_URI[md5sum] = "3858825ecbca4fc3363b55c332693698"
SRC_URI[sha256sum] = "a3e4ca9484ee4ad754ad04fcc14a12686d48d1463c264173d6f8ff0a4df816a6"

GEM_NAME = "ffi-libarchive"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-ffi \
"

BBCLASSEXTEND = "native"
