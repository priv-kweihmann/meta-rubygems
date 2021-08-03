# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: activemodel"
DESCRIPTION = "A toolkit for building modeling frameworks like Active Record"
HOMEPAGE = "https://rubyonrails.org"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://MIT-LICENSE;md5=beb6db6f575459e4eb88269312cddd4e"

DEPENDS:class-native += "\
    rubygems-activesupport-native \
"

SRC_URI[md5sum] = "7cc71c8aa1ad204ca96529c4a077cd87"
SRC_URI[sha256sum] = "27f3223172e81b8e60e7da7f3b812bba046472716def6793d89c177b9e435e76"

GEM_NAME = "activemodel"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-activesupport \
"

BBCLASSEXTEND = "native"
