# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: activemodel"
DESCRIPTION = "A toolkit for building modeling frameworks like Active Record"
HOMEPAGE = "https://rubyonrails.org"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://MIT-LICENSE;md5=beb6db6f575459e4eb88269312cddd4e"

DEPENDS_class-native += "\
    rubygems-activesupport-native \
"

SRC_URI[md5sum] = "663ad8020b8549e16437a9dec9b32213"
SRC_URI[sha256sum] = "5459410a49855d18b89ecf2d509cb74924e37559a01a991b41d9fb4c201cedbe"

GEM_NAME = "activemodel"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS_${PN}_class-target += "\
    rubygems-activesupport \
"

BBCLASSEXTEND = "native"
