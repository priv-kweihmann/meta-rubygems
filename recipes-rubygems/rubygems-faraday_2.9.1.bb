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
"

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "03c0a143f2e14a0a353655a7c8fe87aa"
SRC_URI[sha256sum] = "8ffbc8aaa28509dc31edd57f27a9e49250a283caf0d04090667a3264895b168a"

GEM_NAME = "faraday"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-faraday-net-http \
"

BBCLASSEXTEND = "native"
