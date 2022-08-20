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

SRC_URI[md5sum] = "64cb545a6ddcfc93c68fe53ac594c5f7"
SRC_URI[sha256sum] = "bc724a176ef02118c8a3ed6b5c04c39cf59209607ffcce77b91d0261dbadedfa"

GEM_NAME = "addressable"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-public-suffix \
"

BBCLASSEXTEND = "native"
