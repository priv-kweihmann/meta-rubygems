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

SRC_URI[md5sum] = "c1093335f486314a2a68757cafebdaab"
SRC_URI[sha256sum] = "d45b78c8ee864c4783fbc276f845243d4a7918a67301c052647bacabec0529e9"

GEM_NAME = "faraday_middleware"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-faraday \
"

BBCLASSEXTEND = "native"
