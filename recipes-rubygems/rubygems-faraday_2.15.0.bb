# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: faraday"
DESCRIPTION = "HTTP/REST API client library."
HOMEPAGE = "https://lostisland.github.io/faraday"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=32b1b779179d23cab52d779ba1bd2da8"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

DEPENDS:class-native += "\
    rubygems-faraday-net-http-native \
    rubygems-json-native \
    rubygems-logger-native \
"

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "a4b3c43273184cbd9cdcec70daa4a5e5"
SRC_URI[sha256sum] = "3be0eff0187ed913a1b4f679e9fcfe845b542cdd4f75b76cd6181a4ae1335fff"

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
