# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: launchy"
DESCRIPTION = "Launchy is helper class for launching cross-platform applications in a fire and forget manner"
HOMEPAGE = "https://github.com/copiousfreetime/launchy"

LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=5d95e8ecc37ab1c58553bc15da8a1341"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

DEPENDS:class-native += "\
    rubygems-addressable-native \
    rubygems-childprocess-native \
    rubygems-logger-native \
"

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "fb281c5f82905c6a98ea84696c6a2654"
SRC_URI[sha256sum] = "72b847b5cc961589dde2c395af0108c86ff0119f42d4648d25b5440ebb10059e"

GEM_NAME = "launchy"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-addressable \
    rubygems-childprocess \
    rubygems-logger \
"

BBCLASSEXTEND = "native"
