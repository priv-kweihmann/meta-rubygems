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
    rubygems-json-native \
    rubygems-logger-native \
"

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "03e148b8aa90790bd521076b9b799f5a"
SRC_URI[sha256sum] = "1882247e6766615c8220b4392bf1d27f6ebb63d8e28267587cef1fb0bf37f278"

GEM_NAME = "faraday"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-faraday-net-http \
    rubygems-json \
    rubygems-logger \
"

BBCLASSEXTEND = "native"
