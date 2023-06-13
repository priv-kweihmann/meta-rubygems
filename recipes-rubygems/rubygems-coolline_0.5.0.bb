# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: coolline"
DESCRIPTION = "A readline-like library that allows to change how the inputis displayed."
HOMEPAGE = "http://github.com/Mon-Ouie/coolline"

LICENSE = "Zlib"
LIC_FILES_CHKSUM = "file://LICENSE;md5=61c81329523ba99224d8437da2835e32"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

DEPENDS:class-native += "\
    rubygems-unicode-utils-native \
"

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "42e17ccbcd35271348a54f39b05b7ada"
SRC_URI[sha256sum] = "217ad208d49b752ef31c24be1aec1cdc199893afd8ae7bc9d10335e5c76dccea"

GEM_NAME = "coolline"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-unicode-utils \
"

BBCLASSEXTEND = "native"
