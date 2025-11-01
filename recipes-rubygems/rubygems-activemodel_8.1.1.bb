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

SRC_URI[md5sum] = "9e1bc0c2080c19ee2787e2a8b5c4b11e"
SRC_URI[sha256sum] = "8b7e2496b9e333ced06248c16a43217b950192c98e0fe3aa117eee21501c6fbd"

GEM_NAME = "activemodel"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-activesupport \
"

BBCLASSEXTEND = "native"
