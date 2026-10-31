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
"

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "e818e9226873da8e84d54460fe9e11eb"
SRC_URI[sha256sum] = "9c6861bb599845ea0cb05ffadd3d64c7a3b07a29bdee0f5352bcbe87b7ade21d"

GEM_NAME = "signet"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-addressable \
    rubygems-faraday \
    rubygems-jwt \
"

BBCLASSEXTEND = "native"
