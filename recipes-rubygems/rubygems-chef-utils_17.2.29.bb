# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: chef-utils"
DESCRIPTION = "Basic utility functions for Core Chef Infra development"
HOMEPAGE = "https://github.com/chef/chef/tree/master/chef-utils"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=8f7bb094c7232b058c7e9f2e431f389c"

DEPENDS_class-native += "\
    rubygems-concurrent-ruby-native \
"

SRC_URI[md5sum] = "3c8711330c7f6c6697740cfac7a0c7a8"
SRC_URI[sha256sum] = "a264bdbd5df46253eaf7f3f5812857a76b81d5b96f51d102efdffe44ac66c6cc"

GEM_NAME = "chef-utils"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS_${PN}_class-target += "\
    rubygems-concurrent-ruby \
"

BBCLASSEXTEND = "native"
