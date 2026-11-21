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

SRC_URI[md5sum] = "ee49f9c6cef14832857ef73d8fca2d1d"
SRC_URI[sha256sum] = "4dfcc6ac0ea1b6771daf5fb54cbbca131e4d5922ea0a65ba2da980370dadbe9f"

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
