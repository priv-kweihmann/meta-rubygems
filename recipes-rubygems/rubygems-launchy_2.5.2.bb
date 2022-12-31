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
"

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "e3dd8c265f69898c905575dd10e0730b"
SRC_URI[sha256sum] = "8aa0441655aec5514008e1d04892c2de3ba57bd337afb984568da091121a241b"

GEM_NAME = "launchy"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-addressable \
"

BBCLASSEXTEND = "native"
