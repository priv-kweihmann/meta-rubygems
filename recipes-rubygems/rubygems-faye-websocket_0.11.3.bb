# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: faye-websocket"
DESCRIPTION = "Standards-compliant WebSocket server and client"
HOMEPAGE = "https://github.com/faye/faye-websocket-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=25fa718f0d17a2219fe98bd10990f389"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

DEPENDS:class-native += "\
    rubygems-eventmachine-native \
    rubygems-websocket-driver-native \
"

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "567137d171441434f51ccee5a2f48165"
SRC_URI[sha256sum] = "109187161939c57032d2bba9e5c45621251d73f806bb608d2d4c3ab2cabeb307"

GEM_NAME = "faye-websocket"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-eventmachine \
    rubygems-websocket-driver \
"

BBCLASSEXTEND = "native"
