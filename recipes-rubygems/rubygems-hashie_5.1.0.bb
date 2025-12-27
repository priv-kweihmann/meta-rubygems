# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: hashie"
DESCRIPTION = "Hashie is a collection of classes and mixins that make hashes more powerful."
HOMEPAGE = "https://github.com/hashie/hashie"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=47599a13a6bc4e4df95b6c7354c961ce"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

DEPENDS:class-native += "\
    rubygems-logger-native \
"

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "8cf083973e76dbd103df554b062cf036"
SRC_URI[sha256sum] = "c266471896f323c446ea8207f8ffac985d2718df0a0ba98651a3057096ca3870"

GEM_NAME = "hashie"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-logger \
"

BBCLASSEXTEND = "native"
