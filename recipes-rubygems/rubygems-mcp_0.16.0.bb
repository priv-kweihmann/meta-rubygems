# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: mcp"
DESCRIPTION = "The official Ruby SDK for Model Context Protocol servers and clients"
HOMEPAGE = "https://ruby.sdk.modelcontextprotocol.io"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=5498bbc0155db622ff063f9f7396da88"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " \
    bash \
"

DEPENDS:class-native += "\
    rubygems-json-schema-native \
"

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "d044f545742b187475b30f30d03549fb"
SRC_URI[sha256sum] = "d8ff1a78826945f952eccf803fae1c086e54e91dac7b876038467f5fb1198617"

GEM_NAME = "mcp"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-json-schema \
"

BBCLASSEXTEND = "native"
