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

SRC_URI[md5sum] = "65b53e994d5a3a15acc9a092cb58e80e"
SRC_URI[sha256sum] = "51630e43425078311c056ca75f961bb3bda1641ab36e44ad4c455e0b0e4a231c"

GEM_NAME = "ffi"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
