# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: activemodel"
DESCRIPTION = "A toolkit for building modeling frameworks like Active Record"
HOMEPAGE = "https://rubyonrails.org"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://MIT-LICENSE;md5=48dbb03e765669b2a017264a9ecc9674"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

DEPENDS:class-native += "\
    rubygems-activesupport-native \
"

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "0859803207ddabfbf11a51d56dbb0c2c"
SRC_URI[sha256sum] = "9a0906c127bd118aa5f06157db12b8f750da83dccee72db2f658547a0ae7a0e8"

GEM_NAME = "activemodel"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-activesupport \
"

BBCLASSEXTEND = "native"
