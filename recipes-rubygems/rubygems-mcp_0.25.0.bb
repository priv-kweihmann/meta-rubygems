# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: mcp"
DESCRIPTION = "The official Ruby SDK for Model Context Protocol servers and clients"
HOMEPAGE = "https://ruby.sdk.modelcontextprotocol.io"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=5498bbc0155db622ff063f9f7396da88"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

DEPENDS:class-native += "\
    rubygems-json-schemer-native \
"

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "5bc5b45218db419b7f5f63ff30a6935f"
SRC_URI[sha256sum] = "8acf3a5f3b60b6fd6e5d9b8ac5eb85ac504766976cbadaca182d2ffe7d795d98"

GEM_NAME = "mcp"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-json-schemer \
"

BBCLASSEXTEND = "native"
