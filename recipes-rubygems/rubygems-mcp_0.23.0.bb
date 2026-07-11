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

SRC_URI[md5sum] = "2010730d5a64ddb31cef5a96e0435d43"
SRC_URI[sha256sum] = "3667ee167384778cd81721799dc8060f4a792f63b23ba0804005afd29d7259bc"

GEM_NAME = "mcp"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-json-schemer \
"

BBCLASSEXTEND = "native"
