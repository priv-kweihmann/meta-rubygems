# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: websocket-extensions"
DESCRIPTION = "Generic extension manager for WebSocket connections"
HOMEPAGE = "https://github.com/faye/websocket-extensions-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=608a8da857bde98dd52bde5a1c1fb332"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "7fb0feb6eca8020a2387c2d1a97ec829"
SRC_URI[sha256sum] = "1c6ba63092cda343eb53fc657110c71c754c56484aad42578495227d717a8241"

GEM_NAME = "websocket-extensions"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
