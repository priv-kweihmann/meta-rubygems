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

SRC_URI[md5sum] = "af89d2fb93e2c5d4341068a123f38a31"
SRC_URI[sha256sum] = "bcd1642e06f0d16fc9e09ac6d49c3a7298b9789bcb58127302f934e437d60acf"

GEM_NAME = "ffi"

inherit rubygems
inherit rubygentest
inherit pkgconfig

INSANE_SKIP:${PN} += "rpaths"

BBCLASSEXTEND = "native"
