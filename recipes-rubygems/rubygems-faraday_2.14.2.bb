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

SRC_URI[md5sum] = "d81f69a68f9e7a0ceea37dde776a680c"
SRC_URI[sha256sum] = "73ccb9994a9e8648f010e32eca2ae82e41c57860aa10932cda29418b9e0223ad"

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
