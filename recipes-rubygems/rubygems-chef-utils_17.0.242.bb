# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: chef-utils"
DESCRIPTION = "Basic utility functions for Core Chef Infra development"
HOMEPAGE = "https://github.com/chef/chef/tree/master/chef-utils"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=8f7bb094c7232b058c7e9f2e431f389c"

DEPENDS_class-native += "\
    rubygems-concurrent-ruby-native \
"

SRC_URI[md5sum] = "66cb37aa745139e70d52c903b2180034"
SRC_URI[sha256sum] = "bb7970dc43199ce891ed3472935881626fc676c5fbc1a7348aee50d478cc3a49"

GEM_NAME = "chef-utils"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS_${PN}_class-target += "\
    rubygems-concurrent-ruby \
"

BBCLASSEXTEND = "native"
