# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: mixlib-archive"
DESCRIPTION = "A simple interface to various archive formats"
HOMEPAGE = "https://github.com/chef/mixlib-archive"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=8f7bb094c7232b058c7e9f2e431f389c"

DEPENDS_class-native += "\
    rubygems-mixlib-log-native \
"

SRC_URI[md5sum] = "f34cf7c59eb19471ac072ae581edb0f2"
SRC_URI[sha256sum] = "b36d2475e1f03b7a728b7e8fd9b3ee36d1dd6a6bcebc29ca8f395cbb73144536"

GEM_NAME = "mixlib-archive"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS_${PN}_class-target += "\
    rubygems-mixlib-log \
"

BBCLASSEXTEND = "native"
