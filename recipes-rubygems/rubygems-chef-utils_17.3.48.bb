# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: chef-utils"
DESCRIPTION = "Basic utility functions for Core Chef Infra development"
HOMEPAGE = "https://github.com/chef/chef/tree/master/chef-utils"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=8f7bb094c7232b058c7e9f2e431f389c"

DEPENDS:class-native += "\
    rubygems-concurrent-ruby-native \
"

SRC_URI[md5sum] = "7bbbfa687ee235867ffcdf8058748170"
SRC_URI[sha256sum] = "2cdde3512dd35dc8e5fc7de6b7018e1ef0f9b7902456511298532396c0b40f55"

GEM_NAME = "chef-utils"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-concurrent-ruby \
"

BBCLASSEXTEND = "native"
