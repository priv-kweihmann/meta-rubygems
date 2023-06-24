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

SRC_URI[md5sum] = "260d9b1ef5060f5f374de7a6ccb256eb"
SRC_URI[sha256sum] = "1ea3c705cf3546c21e1379502dfdba002a25909e7aba85bb60e7caea6d6724aa"

GEM_NAME = "faraday"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-faraday-net-http \
    rubygems-ruby2-keywords \
"

BBCLASSEXTEND = "native"
