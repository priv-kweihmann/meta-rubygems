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

SRC_URI[md5sum] = "a9099bece6817dc3e5cf615275794f37"
SRC_URI[sha256sum] = "462986537cf3735ab5f3c0f557f14155d778f4b43ea4f485a9deb9c8f7c58232"

GEM_NAME = "addressable"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-public-suffix \
"

BBCLASSEXTEND = "native"
