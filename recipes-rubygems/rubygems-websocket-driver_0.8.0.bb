# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: websocket-driver"
DESCRIPTION = "WebSocket protocol handler with pluggable I/O"
HOMEPAGE = "https://github.com/faye/websocket-driver-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=f307b44409bc0386d1fca56273f1e743"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

DEPENDS:class-native += "\
    rubygems-base64-native \
    rubygems-websocket-extensions-native \
"

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "b8bb55057241cb0479a4061147fab98c"
SRC_URI[sha256sum] = "ed0dba4b943c22f17f9a734817e808bc84cdce6a7e22045f5315aa57676d4962"

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
