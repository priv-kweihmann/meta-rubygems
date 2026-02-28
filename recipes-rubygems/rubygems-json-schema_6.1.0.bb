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

SRC_URI[md5sum] = "5838013193d6df07129862373ff6ecf0"
SRC_URI[sha256sum] = "6bf70a2cfb6dfd5a06da28093fa8190f324c88eabd36a7f47097f227321dc702"

GEM_NAME = "json-schema"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-addressable \
    rubygems-bigdecimal \
"

BBCLASSEXTEND = "native"
