# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: websocket-extensions"
DESCRIPTION = "Generic extension manager for WebSocket connections"
HOMEPAGE = "https://github.com/faye/websocket-extensions-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=38cd265a6e28ad902e89de178dc219cf"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "5f5c6b525200a832c59121be308e474e"
SRC_URI[sha256sum] = "6fb0d0f687aa8adc8eafa5ce68db36dfd6a8ebf232515040ce27c33c1291e589"

GEM_NAME = "websocket-extensions"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
