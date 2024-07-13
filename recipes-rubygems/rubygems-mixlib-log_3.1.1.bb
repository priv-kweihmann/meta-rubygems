# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: mixlib-log"
DESCRIPTION = "A gem that provides a simple mixin for log functionality"
HOMEPAGE = "https://github.com/chef/mixlib-log"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=8f7bb094c7232b058c7e9f2e431f389c"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

DEPENDS:class-native += "\
    rubygems-ffi-native \
"

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "39f5ed859733ad03af5d2328397a4ad4"
SRC_URI[sha256sum] = "c7e796a2e99db6552a31cd2eb008c7742ac38786cf64ce2ff5cc6d97578e043a"

GEM_NAME = "mixlib-log"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-ffi \
"

BBCLASSEXTEND = "native"
