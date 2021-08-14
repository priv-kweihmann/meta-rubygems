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

SRC_URI[md5sum] = "60eec3de8305490fb0e72609a4c2e90a"
SRC_URI[sha256sum] = "ff47586b93280aa6dd4d9a9097337219f641f829b6d56b709339eda1697a5e78"

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
