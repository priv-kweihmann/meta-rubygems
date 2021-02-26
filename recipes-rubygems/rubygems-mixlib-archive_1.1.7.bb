# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: mixlib-archive"
DESCRIPTION = "A simple interface to various archive formats"
HOMEPAGE = "https://github.com/chef/mixlib-archive"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=8f7bb094c7232b058c7e9f2e431f389c"

DEPENDS_class-native += "\
    rubygems-mixlib-log-native \
"

SRC_URI[md5sum] = "7c9dc02dcb6813a652b80010bf6f7138"
SRC_URI[sha256sum] = "cad86dbde1edcfb28ec4344d4e07451e6f37d7204f80ba2102a690a710047c9f"

GEM_NAME = "mixlib-archive"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS_${PN}_class-target += "\
    rubygems-mixlib-log \
"

BBCLASSEXTEND = "native"
