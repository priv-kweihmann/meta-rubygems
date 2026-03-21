# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: mcp"
DESCRIPTION = "The official Ruby SDK for Model Context Protocol servers and clients"
HOMEPAGE = "https://github.com/modelcontextprotocol/ruby-sdk"

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

SRC_URI[md5sum] = "37dab0ca929ee9196433960a0686883a"
SRC_URI[sha256sum] = "a0a3737b0ac9df0772f4ef7e2b013c260ddbcf217a5d50a66bff0baeddf03e47"

GEM_NAME = "mcp"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-json-schema \
"

BBCLASSEXTEND = "native"
