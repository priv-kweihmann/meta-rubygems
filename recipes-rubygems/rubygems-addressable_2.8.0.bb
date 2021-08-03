# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: addressable"
DESCRIPTION = "Addressable is an alternative implementation to the URI implementation that ispart of Ruby's standard library"
HOMEPAGE = "https://github.com/sporkmonger/addressable"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=f124bfaefacd4e1a4080065d403bc1d4"

DEPENDS:class-native += "\
    rubygems-public-suffix-native \
"

SRC_URI[md5sum] = "9cd03fc88dd69b3c3491ce73de27f2f7"
SRC_URI[sha256sum] = "f76d29d2d1f54b6c6a49aec58f9583b08d97e088c227a3fcba92f6c6531d5908"

GEM_NAME = "addressable"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-public-suffix \
"

BBCLASSEXTEND = "native"
