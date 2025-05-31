# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: faye-websocket"
DESCRIPTION = "Standards-compliant WebSocket server and client"
HOMEPAGE = "https://github.com/faye/faye-websocket-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=f307b44409bc0386d1fca56273f1e743"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

DEPENDS:class-native += "\
    rubygems-eventmachine-native \
    rubygems-websocket-driver-native \
"

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "f6cc12607af08cf19c1415152c439e9a"
SRC_URI[sha256sum] = "ad9f7dfcd0306d0a13baeee450729657661129af15bb5f38716c242484ab42e1"

GEM_NAME = "faye-websocket"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-eventmachine \
    rubygems-websocket-driver \
"

BBCLASSEXTEND = "native"
