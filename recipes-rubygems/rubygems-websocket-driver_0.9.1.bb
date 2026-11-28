# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: websocket-driver"
DESCRIPTION = "WebSocket protocol handler with pluggable I/O"
HOMEPAGE = "https://github.com/faye/websocket-driver-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=9b7b313780d45a859653127cf7439e17"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

DEPENDS:class-native += "\
    rubygems-base64-native \
    rubygems-websocket-extensions-native \
"

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "4f7b2b380aa03cd01f1e912922501860"
SRC_URI[sha256sum] = "8b6c5c0834f77f53b86d486cc761c99d60df807a8264267ea52fca0da660bb1e"

GEM_NAME = "websocket-driver"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-base64 \
    rubygems-websocket-extensions \
"

INSANE_SKIP:${PN} += "rpaths"

BBCLASSEXTEND = "native"
