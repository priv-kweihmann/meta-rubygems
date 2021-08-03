# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: coercible"
DESCRIPTION = "Powerful, flexible and configurable coercion library"
HOMEPAGE = "https://github.com/solnic/coercible"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=a2f3cab50161b5e2aaef2d9570e55703"

DEPENDS:class-native += "\
    rubygems-descendants-tracker-native \
"

SRC_URI[md5sum] = "cf1636c69f5c175d41b355abf733ea19"
SRC_URI[sha256sum] = "5081ad24352cc8435ce5472bc2faa30260c7ea7f2102cc6a9f167c4d9bffaadc"

GEM_NAME = "coercible"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-descendants-tracker \
"

BBCLASSEXTEND = "native"
