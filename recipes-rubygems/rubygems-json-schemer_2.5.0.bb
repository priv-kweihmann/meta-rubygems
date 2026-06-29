# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: json_schemer"
DESCRIPTION = "JSON Schema validator"
HOMEPAGE = "https://github.com/davishmcclurg/json_schemer"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=d2196d988ac05bce6be7681eb952d9c2"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

DEPENDS:class-native += "\
    rubygems-bigdecimal-native \
    rubygems-hana-native \
    rubygems-regexp-parser-native \
    rubygems-simpleidn-native \
"

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "47002e3e537969c821afc1e5aefda5a4"
SRC_URI[sha256sum] = "2f01fb4cce721a4e08dd068fc2030cffd0702a7f333f1ea2be6e8991f00ae396"

GEM_NAME = "json_schemer"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-bigdecimal \
    rubygems-hana \
    rubygems-regexp-parser \
    rubygems-simpleidn \
"

BBCLASSEXTEND = "native"
