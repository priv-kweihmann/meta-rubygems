# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: json-schema"
DESCRIPTION = "Ruby JSON Schema Validator"
HOMEPAGE = "https://github.com/voxpupuli/json-schema/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=ea01c3bde29ebea5b956cb624610427b"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

DEPENDS:class-native += "\
    rubygems-addressable-native \
    rubygems-bigdecimal-native \
"

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "36313941503fdfcc4a31a234b733165f"
SRC_URI[sha256sum] = "c0bf6113d772348bfd159fb096950beeb1e1e25aaeea50b676bd45191d8dbdf3"

GEM_NAME = "json-schema"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-addressable \
    rubygems-bigdecimal \
"

BBCLASSEXTEND = "native"
