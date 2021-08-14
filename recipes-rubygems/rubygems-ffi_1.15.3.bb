# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: ffi"
DESCRIPTION = "Ruby FFI library"
HOMEPAGE = "https://github.com/ffi/ffi/wiki"

LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://COPYING;md5=0b4e3af2fd54eb00a94b967e6b927818"

EXTRA_RDEPENDS:append = " \
    libffi \
"

GEM_INSTALL_FLAGS:append = " \
    --enable-system-libffi \
    --with-opt-dir=${RECIPE_SYSROOT} \
"

SRC_URI[md5sum] = "7cbf44ea1c86e5ae67f60be71bf62716"
SRC_URI[sha256sum] = "98d5c5c4281c9c0466acc60cf0e79124bf3c311417fd97e7473e41722953fbf1"

GEM_NAME = "ffi"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
