# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: mixlib-config"
DESCRIPTION = "A class based configuration library"
HOMEPAGE = "https://github.com/chef/mixlib-config"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=8f7bb094c7232b058c7e9f2e431f389c"

DEPENDS_class-native += "\
    rubygems-tomlrb-native \
"

SRC_URI[md5sum] = "9cd9034a4ad4285bedfa297084d29b7e"
SRC_URI[sha256sum] = "9867adab3ab547eb74a8efdc9dfab6bcc83d2802a571ff8af8d6e981ca8d53ab"

GEM_NAME = "mixlib-config"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS_${PN}_class-target += "\
    rubygems-tomlrb \
"

BBCLASSEXTEND = "native"
