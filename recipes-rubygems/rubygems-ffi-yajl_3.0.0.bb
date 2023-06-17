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

SRC_URI[md5sum] = "dabca4e00bd6e39c47df9c8653baa273"
SRC_URI[sha256sum] = "90c60945353d67414a2ed239b9b6d03035745f471a7a5acb80828fb2e098b700"

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
