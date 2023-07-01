# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: faraday"
DESCRIPTION = "HTTP/REST API client library."
HOMEPAGE = "https://lostisland.github.io/faraday"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=16803e44761e7ff8111818414be5e7ce"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

DEPENDS:class-native += "\
    rubygems-faraday-net-http-native \
    rubygems-ruby2-keywords-native \
"

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "68009d14cdea4077341132218011d3f4"
SRC_URI[sha256sum] = "f14455fd71d5d560ad77843e2cd63bea61d1a6e37ab3d999f070c25b176265d3"

GEM_NAME = "faraday"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-faraday-net-http \
    rubygems-ruby2-keywords \
"

BBCLASSEXTEND = "native"
