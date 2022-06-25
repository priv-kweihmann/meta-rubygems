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

SRC_URI[md5sum] = "b2f05c3d81290f9d71e53d4dee9342f2"
SRC_URI[sha256sum] = "1d2831930dc28da32e34bec68cf7ded97ee2867b208f97c500ee293829cb0004"

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
