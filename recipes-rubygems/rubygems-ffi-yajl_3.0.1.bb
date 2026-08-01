# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: ffi-yajl"
DESCRIPTION = "Ruby FFI wrapper around YAJL 2.x"
HOMEPAGE = "http://github.com/chef/ffi-yajl"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=9fec91e3a38b72830adbebe037af5027"

EXTRA_DEPENDS:append = " \
    rubygems-libyajl2 \
    yajl \
"
EXTRA_RDEPENDS:append = " \
    yajl \
"

DEPENDS:class-native += "\
    rubygems-libyajl2-native \
"

GEM_INSTALL_FLAGS:append = " \
    --with-opt=${RECIPE_SYSROOT} \
"

SRC_URI[md5sum] = "c0e4e08ce6a844288d8fe0ee5b955183"
SRC_URI[sha256sum] = "278ce88c3023f43466f1ba014d4650b41298c15b80931c06b8008138deb20677"

GEM_NAME = "ffi-yajl"

export FORCE_FFI_YAJL = "ffi"

export USE_SYSTEM_LIBYAJL2 = "1"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-libyajl2 \
"

INSANE_SKIP:${PN} += "rpaths"

BBCLASSEXTEND = "native"
