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

SRC_URI[md5sum] = "53b580e3d6f86a517234195d13d60c97"
SRC_URI[sha256sum] = "0e9f39f7bb3934f77ad6feab49662be77e87eedcdeb2a3f5c0234c2938563d4c"

GEM_NAME = "ffi"

inherit rubygems
inherit rubygentest
inherit pkgconfig

INSANE_SKIP:${PN} += "rpaths"

BBCLASSEXTEND = "native"
