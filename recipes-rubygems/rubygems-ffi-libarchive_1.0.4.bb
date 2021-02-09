# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: ffi-libarchive"
DESCRIPTION = "A Ruby FFI binding to libarchive."
HOMEPAGE = "https://github.com/chef/ffi-libarchive"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=8f7bb094c7232b058c7e9f2e431f389c"

EXTRA_RDEPENDS += "libarchive"

DEPENDS_class-native += "\
    rubygems-ffi-native \
"
RDEPENDS_${PN}_class-target += "\
    rubygems-ffi \
"

SRC_URI[md5sum] = "b444ee23125997985a81188cf976299a"
SRC_URI[sha256sum] = "a18bdc820bca9407f6ef958aafec449418d97a1bb3fde30bc5e56856fe0b154b"

GEM_NAME = "ffi-libarchive"



inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
