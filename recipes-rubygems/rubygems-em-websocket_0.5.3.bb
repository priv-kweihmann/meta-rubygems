# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: em-websocket"
DESCRIPTION = "EventMachine based WebSocket server"
HOMEPAGE = "http://github.com/igrigorik/em-websocket"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENCE;md5=4380eb54de8fb059e00993d1f4a8537f"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

DEPENDS:class-native += "\
    rubygems-eventmachine-native \
    rubygems-http-parser.rb-native \
"

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "d9bacf756e7e3100aa3790aad5b289d0"
SRC_URI[sha256sum] = "f56a92bde4e6cb879256d58ee31f124181f68f8887bd14d53d5d9a292758c6a8"

GEM_NAME = "em-websocket"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-eventmachine \
    rubygems-http-parser.rb \
"

BBCLASSEXTEND = "native"
