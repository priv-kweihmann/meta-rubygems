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

SRC_URI[md5sum] = "333e1547b43706c7f87a2995d5805d32"
SRC_URI[sha256sum] = "bdf3261177b948b0777a6f247c57aad5f64c84830c02d126d4bfea188b0cebb7"

GEM_NAME = "mcp"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-json-schemer \
"

BBCLASSEXTEND = "native"
