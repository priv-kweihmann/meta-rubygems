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

SRC_URI[md5sum] = "c40c7b7a717f0b004d6866038b937057"
SRC_URI[sha256sum] = "a66b71254cd8c49c471cfa55f11a9f050817ab7168cadf961555784d365b8474"

GEM_NAME = "mcp"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-json-schema \
"

BBCLASSEXTEND = "native"
