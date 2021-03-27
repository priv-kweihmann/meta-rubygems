# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: activemodel"
DESCRIPTION = "A toolkit for building modeling frameworks like Active Record"
HOMEPAGE = "https://rubyonrails.org"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://MIT-LICENSE;md5=beb6db6f575459e4eb88269312cddd4e"

DEPENDS_class-native += "\
    rubygems-activesupport-native \
"

SRC_URI[md5sum] = "186f2d7beace6d93ed726fc67206c51f"
SRC_URI[sha256sum] = "b52bb9d4cff30e3084c10b88dff081e5e0ccbdee5446a56a78c5454892a41a85"

GEM_NAME = "activemodel"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS_${PN}_class-target += "\
    rubygems-activesupport \
"

BBCLASSEXTEND = "native"
