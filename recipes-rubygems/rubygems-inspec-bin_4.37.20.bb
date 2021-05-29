# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: inspec-bin"
DESCRIPTION = "InSpec executable for inspec gem"
HOMEPAGE = "https://github.com/inspec/inspec/tree/master/inspec-bin"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=81b0e16be045534c5330969d1e542bb4"

DEPENDS_class-native += "\
    rubygems-inspec-native \
"

SRC_URI[md5sum] = "af69c540fcd066675b9e208b2a91df56"
SRC_URI[sha256sum] = "e0cd0e3df1cd330a0e856770496d7391f01a769a80dbff124bb8762268dfe209"

GEM_NAME = "inspec-bin"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS_${PN}_class-target += "\
    rubygems-inspec \
"

BBCLASSEXTEND = "native"
