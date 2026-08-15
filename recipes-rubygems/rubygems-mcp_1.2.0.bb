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

SRC_URI[md5sum] = "e6d53e0b57012477f4ef31540b631603"
SRC_URI[sha256sum] = "af75a270fbcbff5db74992e1d0664cfe7e2aa7f89fa9b31592bba40e9f554ba6"

GEM_NAME = "mcp"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-json-schemer \
"

BBCLASSEXTEND = "native"
