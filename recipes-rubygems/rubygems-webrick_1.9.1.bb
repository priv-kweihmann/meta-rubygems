# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: webrick"
DESCRIPTION = "WEBrick is an HTTP server toolkit that can be configured as an HTTPS server, a proxy server, and a virtual-host server."
HOMEPAGE = "https://github.com/ruby/webrick"

LICENSE = "Ruby & BSD-2-Clause"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=19aaf65c88a40b508d17ae4be539c4b5"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "f4e793196edc6c08e67a1b6e4aab3557"
SRC_URI[sha256sum] = "b42d3c94f166f3fb73d87e9b359def9b5836c426fc8beacf38f2184a21b2a989"

GEM_NAME = "webrick"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
