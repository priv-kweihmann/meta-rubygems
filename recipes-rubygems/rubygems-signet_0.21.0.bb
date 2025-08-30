# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: signet"
DESCRIPTION = "Signet is an OAuth 1.0 / OAuth 2.0 implementation."
HOMEPAGE = "https://github.com/googleapis/signet"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=f124bfaefacd4e1a4080065d403bc1d4"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

DEPENDS:class-native += "\
    rubygems-addressable-native \
    rubygems-faraday-native \
    rubygems-jwt-native \
    rubygems-multi-json-native \
"

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "4f386244311be0d6b96f3a721c18e5a3"
SRC_URI[sha256sum] = "d617e9fbf24928280d39dcfefba9a0372d1c38187ffffd0a9283957a10a8cd5b"

GEM_NAME = "signet"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-addressable \
    rubygems-faraday \
    rubygems-jwt \
    rubygems-multi-json \
"

BBCLASSEXTEND = "native"
