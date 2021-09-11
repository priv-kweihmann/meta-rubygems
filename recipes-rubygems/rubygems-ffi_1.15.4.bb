# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: ffi"
DESCRIPTION = "Ruby FFI library"
HOMEPAGE = "https://github.com/ffi/ffi/wiki"

LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://COPYING;md5=0b4e3af2fd54eb00a94b967e6b927818"

EXTRA_DEPENDS:append = " \
    libffi \
"
EXTRA_RDEPENDS:append = " "

GEM_INSTALL_FLAGS:append = " \
    --enable-system-libffi \
    --with-opt-dir=${RECIPE_SYSROOT} \
"

SRC_URI[md5sum] = "a2187dd24311ae388a1e6756696f8427"
SRC_URI[sha256sum] = "56cfca5261ead48688241236adfefb07a000a6d17184d7a4eed48d55b9675d6b"

GEM_NAME = "ffi"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
