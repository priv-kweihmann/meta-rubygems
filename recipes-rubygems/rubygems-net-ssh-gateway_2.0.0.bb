# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: net-ssh-gateway"
DESCRIPTION = "A simple library to assist in establishing tunneled Net::SSH connections"
HOMEPAGE = "https://github.com/net-ssh/net-ssh-gateway"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=6c99c0cc0901fbc3607fe997f9898d69"

DEPENDS_class-native += "\
    rubygems-net-ssh-native \
"
RDEPENDS_${PN}_class-target += "\
    rubygems-net-ssh \
"

SRC_URI[md5sum] = "1841d939c1c60e468d517da64e495e31"
SRC_URI[sha256sum] = "1d9cb51de52e2d64982f4c136c30435e914c05a980814a91055c89e183397bd0"

GEM_NAME = "net-ssh-gateway"



inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
