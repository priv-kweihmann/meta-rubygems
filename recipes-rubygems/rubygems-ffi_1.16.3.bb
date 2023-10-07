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

SRC_URI[md5sum] = "b6351ac815d34fe7ec27e3fab1216565"
SRC_URI[sha256sum] = "6d3242ff10c87271b0675c58d68d3f10148fabc2ad6da52a18123f06078871fb"

GEM_NAME = "ffi"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
