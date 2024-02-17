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

SRC_URI[md5sum] = "f376aa1e7d5f0b9e7e649947db08a74e"
SRC_URI[sha256sum] = "537f3939f57f141f691e6069a97ec40f34fadafc4c7e5ba94edb06cf4350dd31"

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
