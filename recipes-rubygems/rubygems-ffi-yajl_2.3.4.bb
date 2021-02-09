# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: ffi-yajl"
DESCRIPTION = "Ruby FFI wrapper around YAJL 2.x"
HOMEPAGE = "http://github.com/chef/ffi-yajl"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=84928ddb161eab99f094cbe0c187e855"

export USE_SYSTEM_LIBYAJL2="1"
export FORCE_FFI_YAJL="ffi"

EXTRA_DEPENDS += "yajl rubygems-libyajl2"
EXTRA_RDEPENDS += "yajl"

GEM_INSTALL_FLAGS += "\
                      --with-opt=${RECIPE_SYSROOT} \
                      "

DEPENDS_class-native += "\
    rubygems-libyajl2-native \
"
RDEPENDS_${PN}_class-target += "\
    rubygems-libyajl2 \
"

SRC_URI[md5sum] = "ecde2c1dd66435b0a9ffa591d9235380"
SRC_URI[sha256sum] = "a54b70a7539745701f79bb38602a3193527c89e939a9ae56096cb07c1fb0d5dd"

GEM_NAME = "ffi-yajl"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"

INSANE_SKIP_${PN} += "ldflags"
