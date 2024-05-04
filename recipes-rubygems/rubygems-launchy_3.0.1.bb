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
"

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "95fd96c4bf190cd1904a1312b347d425"
SRC_URI[sha256sum] = "b7fa60bda0197cf57614e271a250a8ca1f6a34ab889a3c73f67ec5d57c8a7f2c"

GEM_NAME = "launchy"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-addressable \
    rubygems-childprocess \
"

BBCLASSEXTEND = "native"
