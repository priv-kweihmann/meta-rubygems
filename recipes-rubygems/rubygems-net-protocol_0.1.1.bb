# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: net-protocol"
DESCRIPTION = "The abstruct interface for net-* client."
HOMEPAGE = "https://github.com/ruby/net-protocol"

LICENSE = "Ruby & BSD-2-Clause"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=19aaf65c88a40b508d17ae4be539c4b5"

DEPENDS:class-native += "\
    rubygems-io-wait-native \
    rubygems-timeout-native \
"

SRC_URI[md5sum] = "1b0b59c6b8a5fdc71abc4cd70161bb1d"
SRC_URI[sha256sum] = "df0f83950c2a14068659dd819570ea4ca8642331bfdf0fbcb80b67fb38667dc7"

GEM_NAME = "net-protocol"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-io-wait \
    rubygems-timeout \
"

BBCLASSEXTEND = "native"
