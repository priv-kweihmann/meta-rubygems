# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: websocket-extensions"
DESCRIPTION = "Generic extension manager for WebSocket connections"
HOMEPAGE = "https://github.com/faye/websocket-extensions-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=38cd265a6e28ad902e89de178dc219cf"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "c50bb1f964f11dd1827ee33fc6d24e3f"
SRC_URI[sha256sum] = "1492aabd79218294b564e67e9ee6a90abdac1a2981d35a49848bbc39754f0752"

GEM_NAME = "websocket-extensions"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
