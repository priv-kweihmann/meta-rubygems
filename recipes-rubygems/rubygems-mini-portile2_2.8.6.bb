# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: mini_portile2"
DESCRIPTION = "Simple autoconf and cmake builder for developers"
HOMEPAGE = "https://github.com/flavorjones/mini_portile"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=ca91f53befc541b9880a8502e7d2699d"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "01f9fcb11c026ebd2670302443c078af"
SRC_URI[sha256sum] = "4e2ab09b924906fd42c0b6eb72816db6a435d0404e9cbdcc5d722c133b493991"

GEM_NAME = "mini_portile2"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
