# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: faraday-em_http"
DESCRIPTION = "Faraday adapter for Em::Http"
HOMEPAGE = "https://github.com/lostisland/faraday-em_http"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=20830660ee48a0c845a62aad77c18f4a"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

DEPENDS:class-native += "\
    rubygems-em-http-request-native \
    rubygems-faraday-native \
"

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "deb83465e8c2d96c63cafb15e38d0c8d"
SRC_URI[sha256sum] = "05d3845d0b298a7dfbfb8205db39d10f1bc898d455be7a678ca6f460aba71632"

GEM_NAME = "faraday-em_http"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-em-http-request \
    rubygems-faraday \
"

BBCLASSEXTEND = "native"
