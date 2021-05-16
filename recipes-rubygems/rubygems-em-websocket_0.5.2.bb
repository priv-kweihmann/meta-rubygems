# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: em-websocket"
DESCRIPTION = "EventMachine based WebSocket server"
HOMEPAGE = "http://github.com/igrigorik/em-websocket"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENCE;md5=4380eb54de8fb059e00993d1f4a8537f"

DEPENDS_class-native += "\
    rubygems-eventmachine-native \
    rubygems-http-parser.rb-native \
"

SRC_URI[md5sum] = "a730813935b12faf8d6780d4f7e5e19e"
SRC_URI[sha256sum] = "6bae6d8dd9c05c0d1619aef91903c82542de7a15fa92e0110d13a8324eafe1d5"

GEM_NAME = "em-websocket"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS_${PN}_class-target += "\
    rubygems-eventmachine \
    rubygems-http-parser.rb \
"

BBCLASSEXTEND = "native"
