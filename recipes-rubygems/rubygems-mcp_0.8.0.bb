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

SRC_URI[md5sum] = "47722013b0f3759bfce6e70131b1b33c"
SRC_URI[sha256sum] = "ae8bd146bb8e168852866fd26f805f52744f6326afb3211e073f78a95e0c34fb"

GEM_NAME = "mcp"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-json-schema \
"

BBCLASSEXTEND = "native"
