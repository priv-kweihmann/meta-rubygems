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

SRC_URI[md5sum] = "3f3407830f83d9bce4d557cbf883b710"
SRC_URI[sha256sum] = "d283b9d26614de5f6537c5227c0c0726af89ce744bee2da7e9d666dd62f9ff68"

GEM_NAME = "faye-websocket"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-eventmachine \
    rubygems-websocket-driver \
"

BBCLASSEXTEND = "native"
