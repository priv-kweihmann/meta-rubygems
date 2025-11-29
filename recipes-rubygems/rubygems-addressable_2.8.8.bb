# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: addressable"
DESCRIPTION = "Addressable is an alternative implementation to the URI implementation that ispart of Ruby's standard library"
HOMEPAGE = "https://github.com/sporkmonger/addressable"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=f124bfaefacd4e1a4080065d403bc1d4"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

DEPENDS:class-native += "\
    rubygems-public-suffix-native \
"

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "51d1a2204c947a6577fb9c0c7a708036"
SRC_URI[sha256sum] = "7c13b8f9536cf6364c03b9d417c19986019e28f7c00ac8132da4eb0fe393b057"

GEM_NAME = "addressable"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-public-suffix \
"

BBCLASSEXTEND = "native"
