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

SRC_URI[md5sum] = "bcce8e7ec967f7f257196016a1b81235"
SRC_URI[sha256sum] = "1aa114507006eed6779a726b932d5cc12f5f6053984a19a3403539306b0e0be3"

GEM_NAME = "faraday"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-faraday-net-http \
"

BBCLASSEXTEND = "native"
