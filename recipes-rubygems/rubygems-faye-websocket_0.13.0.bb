# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: faye-websocket"
DESCRIPTION = "Standards-compliant WebSocket server and client"
HOMEPAGE = "https://github.com/faye/faye-websocket-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=9b7b313780d45a859653127cf7439e17"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

DEPENDS:class-native += "\
    rubygems-eventmachine-native \
    rubygems-websocket-driver-native \
"

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "ce132cf9b6e98cb35bd4a61d2f7070cf"
SRC_URI[sha256sum] = "4c83189002a11fc884d78a7e9e3e1d5a9651f79129ab7d1452a19b1c656e5cc5"

GEM_NAME = "faye-websocket"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-eventmachine \
    rubygems-websocket-driver \
"

BBCLASSEXTEND = "native"
