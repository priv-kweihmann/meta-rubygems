# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: chef-utils"
DESCRIPTION = "Basic utility functions for Core Chef Infra development"
HOMEPAGE = "https://github.com/chef/chef/tree/main/chef-utils"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=8f7bb094c7232b058c7e9f2e431f389c"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

DEPENDS:class-native += "\
    rubygems-concurrent-ruby-native \
"

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "ea8a8f681ad32be8e84bfdab2f042c0a"
SRC_URI[sha256sum] = "24ec520bf94c40ad948ddd14f4af5b4034e97ae31b521f2e427da3dd37832af5"

GEM_NAME = "chef-utils"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-concurrent-ruby \
"

BBCLASSEXTEND = "native"
