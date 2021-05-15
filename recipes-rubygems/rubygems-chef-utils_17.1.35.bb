# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: chef-utils"
DESCRIPTION = "Basic utility functions for Core Chef Infra development"
HOMEPAGE = "https://github.com/chef/chef/tree/master/chef-utils"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=8f7bb094c7232b058c7e9f2e431f389c"

DEPENDS_class-native += "\
    rubygems-concurrent-ruby-native \
"

SRC_URI[md5sum] = "6d93872cc0140290adec05a083d14d1c"
SRC_URI[sha256sum] = "3e1768ebb0498e48cd36200ec61b7570b6c6ff7494731d2a93a287d7ec7b6adb"

GEM_NAME = "chef-utils"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS_${PN}_class-target += "\
    rubygems-concurrent-ruby \
"

BBCLASSEXTEND = "native"
