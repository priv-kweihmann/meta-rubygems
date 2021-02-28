# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: signet"
DESCRIPTION = "Signet is an OAuth 1.0 / OAuth 2.0 implementation."
HOMEPAGE = "https://github.com/googleapis/signet"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=f124bfaefacd4e1a4080065d403bc1d4"

DEPENDS_class-native += "\
    rubygems-addressable-native \
    rubygems-faraday-native \
    rubygems-jwt-native \
    rubygems-multi-json-native \
"

SRC_URI[md5sum] = "85d6d6ac1b31424e531861c363f80539"
SRC_URI[sha256sum] = "bb878fe3cc115246c3bfbbec87f6d5bcdd49372347a9ead25d431699b3d5b9fe"

GEM_NAME = "signet"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS_${PN}_class-target += "\
    rubygems-addressable \
    rubygems-faraday \
    rubygems-jwt \
    rubygems-multi-json \
"

BBCLASSEXTEND = "native"
