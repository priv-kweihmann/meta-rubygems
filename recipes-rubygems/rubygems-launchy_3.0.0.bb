# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: launchy"
DESCRIPTION = "Launchy is helper class for launching cross-platform applications in a fire and forget manner"
HOMEPAGE = "https://github.com/copiousfreetime/launchy"

LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE;md5=5d95e8ecc37ab1c58553bc15da8a1341"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

DEPENDS:class-native += "\
    rubygems-addressable-native \
    rubygems-childprocess-native \
"

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "6d7b711e8eb76d01d204d25e0001eb2c"
SRC_URI[sha256sum] = "4abcdab659689550ceca6ec0630cd9efd9940b51dc14cb4ebceee8f7aedc791b"

GEM_NAME = "launchy"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-addressable \
    rubygems-childprocess \
"

BBCLASSEXTEND = "native"
