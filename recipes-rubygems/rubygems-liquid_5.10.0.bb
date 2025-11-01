# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: liquid"
DESCRIPTION = "A secure, non-evaling end user template engine with aesthetic markup."
HOMEPAGE = "https://shopify.github.io/liquid/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=f2a65a7b0b338ce2e5c688284735d982"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

DEPENDS:class-native += "\
    rubygems-bigdecimal-native \
    rubygems-strscan-native \
"

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "cde3f38c461b124390d02953fc159207"
SRC_URI[sha256sum] = "0d719186676d8be9d15d2bea7fd76388faf24a2aa7ad803c3de161322f74adc6"

GEM_NAME = "liquid"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-bigdecimal \
    rubygems-strscan \
"

BBCLASSEXTEND = "native"
