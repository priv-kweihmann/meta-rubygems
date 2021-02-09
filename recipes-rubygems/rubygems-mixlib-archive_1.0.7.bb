# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: mixlib-archive"
DESCRIPTION = "A simple interface to various archive formats"
HOMEPAGE = "https://github.com/chef/mixlib-archive"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=8f7bb094c7232b058c7e9f2e431f389c"

DEPENDS_class-native += "\
    rubygems-mixlib-log-native \
"
RDEPENDS_${PN}_class-target += "\
    rubygems-mixlib-log \
"

SRC_URI[md5sum] = "9308b317dacde7d5eb3dbc376358ed6e"
SRC_URI[sha256sum] = "73854bea4a2a654a56bb231da9eaba5df95535bbc084de9fd833326af40a231a"

GEM_NAME = "mixlib-archive"



inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
