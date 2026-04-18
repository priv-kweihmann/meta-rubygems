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

SRC_URI[md5sum] = "5b3584984a20cda013cdbd396ae7656e"
SRC_URI[sha256sum] = "8e5e72ec9cc8d37b048e41a4b469689c5897b4768843ef8e5eb36fa8897eb1d5"

GEM_NAME = "mcp"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-json-schema \
"

BBCLASSEXTEND = "native"
