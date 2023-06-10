# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: ffi-yajl"
DESCRIPTION = "Ruby FFI wrapper around YAJL 2.x"
HOMEPAGE = "http://github.com/chef/ffi-yajl"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=84928ddb161eab99f094cbe0c187e855"

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

SRC_URI[md5sum] = "0858f7d26a43141f98838a904a554542"
SRC_URI[sha256sum] = "bb4884eaa227fb7b5bb1959309e8b531dba908f7875154e7224a68d23efda54f"

GEM_NAME = "ffi-yajl"

export FORCE_FFI_YAJL="ffi"

export USE_SYSTEM_LIBYAJL2="1"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-libyajl2 \
"

BBCLASSEXTEND = "native"
