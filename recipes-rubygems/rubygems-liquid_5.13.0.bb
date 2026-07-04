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

SRC_URI[md5sum] = "7183c3f6f868276e68b81dc8ac8d862b"
SRC_URI[sha256sum] = "09d594fd96b98e19a8fd5c32aadcc6950df429b69f48c2f774c0db0ce272bf19"

GEM_NAME = "liquid"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-bigdecimal \
    rubygems-strscan \
"

BBCLASSEXTEND = "native"
