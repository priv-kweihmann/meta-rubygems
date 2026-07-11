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
    rubygems-stringio-native \
"

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "1c17e71f3daea5ecf90d1825fe1020db"
SRC_URI[sha256sum] = "72dd12420ccb3f62c32466c2e4d8ab1cc08ae525c2488f30524be6ee8cb6e606"

GEM_NAME = "nori"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-bigdecimal \
    rubygems-stringio \
"

BBCLASSEXTEND = "native"
