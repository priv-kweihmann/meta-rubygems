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

SRC_URI[md5sum] = "55c053b196ad28f72a06b6c77a377bff"
SRC_URI[sha256sum] = "297d449e4e7da6acb0924b323dac5a50475cdce1791fc6fba844e7d13ad90ec3"

GEM_NAME = "mcp"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-json-schemer \
"

BBCLASSEXTEND = "native"
