# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: liquid"
DESCRIPTION = "A secure, non-evaling end user template engine with aesthetic markup."
HOMEPAGE = "http://www.liquidmarkup.org"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=f2a65a7b0b338ce2e5c688284735d982"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

DEPENDS:class-native += "\
    rubygems-bigdecimal-native \
    rubygems-strscan-native \
"

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "4da632af3820aa0b3a433f0c9b47c81c"
SRC_URI[sha256sum] = "1c33a86f719bf2c10ff84bf6e98382eee759e415be4a5c2498cd600c585328ca"

GEM_NAME = "liquid"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-bigdecimal \
    rubygems-strscan \
"

BBCLASSEXTEND = "native"
