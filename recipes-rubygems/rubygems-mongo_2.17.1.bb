# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: mongo"
DESCRIPTION = "A Ruby driver for MongoDB"
HOMEPAGE = "https://docs.mongodb.com/ruby-driver/"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=5c794e202c4ddf604ec533d391ee6775"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

DEPENDS:class-native += "\
    rubygems-bson-native \
"

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "68d820772124ff31f0ecff3a89384c37"
SRC_URI[sha256sum] = "011e0d2b073f4911001925bde73beadfcafa37266ef5375eab704418918751a7"

GEM_NAME = "mongo"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-bson \
"

BBCLASSEXTEND = "native"
