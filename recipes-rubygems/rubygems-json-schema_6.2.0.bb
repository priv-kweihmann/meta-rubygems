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

SRC_URI[md5sum] = "ac8b7ae03e41c7f71dc53122d3702e78"
SRC_URI[sha256sum] = "e8bff46ed845a22c1ab2bd0d7eccf831c01fe23bb3920caa4c74db4306813666"

GEM_NAME = "json-schema"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-addressable \
    rubygems-bigdecimal \
"

BBCLASSEXTEND = "native"
