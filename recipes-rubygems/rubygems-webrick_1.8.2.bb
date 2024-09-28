# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: webrick"
DESCRIPTION = "WEBrick is an HTTP server toolkit that can be configured as an HTTPS server, a proxy server, and a virtual-host server."
HOMEPAGE = "https://github.com/ruby/webrick"

LICENSE = "Ruby & BSD-2-Clause"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=19aaf65c88a40b508d17ae4be539c4b5"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "adbdcb13788330c40b54c1134bf5d7a7"
SRC_URI[sha256sum] = "431746a349199546ff9dd272cae10849c865f938216e41c402a6489248f12f21"

GEM_NAME = "webrick"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
