# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: nori"
DESCRIPTION = "XML to Hash translator"
HOMEPAGE = "https://github.com/savonrb/nori"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=c6f524fd55eb30137bfb7f40fae63208"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

DEPENDS:class-native += "\
    rubygems-bigdecimal-native \
"

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "d5160a14a24ce641b48cb500497aa9b5"
SRC_URI[sha256sum] = "140b5d7ab8557b94f48b5c494b4ee90acd029db5a6b022233a09b02fcdd88e8b"

GEM_NAME = "nori"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-bigdecimal \
"

BBCLASSEXTEND = "native"
