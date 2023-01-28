# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: webrick"
DESCRIPTION = "WEBrick is an HTTP server toolkit that can be configured as an HTTPS server, a proxy server, and a virtual-host server."
HOMEPAGE = "https://github.com/ruby/webrick"

LICENSE = "Ruby & BSD-2-Clause"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=19aaf65c88a40b508d17ae4be539c4b5"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "e02304c5eafc47d2fb393bba891c538f"
SRC_URI[sha256sum] = "19411ec6912911fd3df13559110127ea2badd0c035f7762873f58afc803e158f"

GEM_NAME = "webrick"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
