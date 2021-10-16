# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: faraday_middleware"
DESCRIPTION = "Various middleware for Faraday"
HOMEPAGE = "https://github.com/lostisland/faraday_middleware"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=a59d0c4589d25cc5037028f3465378d6"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

DEPENDS:class-native += "\
    rubygems-faraday-native \
"

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "e4e21d7a623046f9c23657c74d5cf7de"
SRC_URI[sha256sum] = "ded15d574d50e92bd04448d5566913af5cb1a01b2fa311ceecc2464fa0ab88af"

GEM_NAME = "faraday_middleware"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-faraday \
"

BBCLASSEXTEND = "native"
