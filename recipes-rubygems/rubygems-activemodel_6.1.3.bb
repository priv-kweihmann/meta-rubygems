# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: activemodel"
DESCRIPTION = "A toolkit for building modeling frameworks like Active Record"
HOMEPAGE = "https://rubyonrails.org"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://MIT-LICENSE;md5=beb6db6f575459e4eb88269312cddd4e"

DEPENDS_class-native += "\
    rubygems-activesupport-native \
"

SRC_URI[md5sum] = "6922c61ee42e9ef8216d9a6d5b3176c4"
SRC_URI[sha256sum] = "e02c3751e0768bf4732d2ca9595628fc5edcb2e429ff625eff2d3406402ea81e"

GEM_NAME = "activemodel"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS_${PN}_class-target += "\
    rubygems-activesupport \
"

BBCLASSEXTEND = "native"
