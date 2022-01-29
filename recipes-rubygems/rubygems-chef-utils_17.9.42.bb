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

SRC_URI[md5sum] = "7fcd5904bb64e795b694a92986aa8414"
SRC_URI[sha256sum] = "578afa7891ce1c6d03020003a14b0e2d23964a96a37e656941b0a836b90e90db"

GEM_NAME = "chef-utils"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-concurrent-ruby \
"

BBCLASSEXTEND = "native"
