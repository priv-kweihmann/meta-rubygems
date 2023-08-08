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

SRC_URI[md5sum] = "a7a31aa032bbe2e1ca5d9fff48c20d73"
SRC_URI[sha256sum] = "63f0fbcde42edf116d6da98a9437f19dd1692152f1efa3fcc4741e443c772117"

GEM_NAME = "addressable"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-public-suffix \
"

BBCLASSEXTEND = "native"
