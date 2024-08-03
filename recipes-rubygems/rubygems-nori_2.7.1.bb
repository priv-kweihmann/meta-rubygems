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

SRC_URI[md5sum] = "83952a081b5e86d5aa62943ca9ccf312"
SRC_URI[sha256sum] = "6166cd336959854762073e2fbae888593809cac1b3e904f4fb009313d7226861"

GEM_NAME = "nori"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-bigdecimal \
"

BBCLASSEXTEND = "native"
