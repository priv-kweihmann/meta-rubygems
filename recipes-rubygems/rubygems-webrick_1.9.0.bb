# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: webrick"
DESCRIPTION = "WEBrick is an HTTP server toolkit that can be configured as an HTTPS server, a proxy server, and a virtual-host server."
HOMEPAGE = "https://github.com/ruby/webrick"

LICENSE = "Ruby & BSD-2-Clause"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=19aaf65c88a40b508d17ae4be539c4b5"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "5cebbf0982df55dfb807950c88873fa9"
SRC_URI[sha256sum] = "9ee50c57006489960b2a07544f68de6f23dfbee30e7b424167b5c14b72ace964"

GEM_NAME = "webrick"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
