# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: chef-config"
DESCRIPTION = "Chef Infra's default configuration and config loading library"
HOMEPAGE = "https://github.com/chef/chef/tree/main/chef-config"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=8f7bb094c7232b058c7e9f2e431f389c"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

DEPENDS:class-native += "\
    rubygems-addressable-native \
    rubygems-chef-utils-native \
    rubygems-fuzzyurl-native \
    rubygems-mixlib-config-native \
    rubygems-mixlib-shellout-native \
    rubygems-tomlrb-native \
"

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "3e4e32283dd65241075dafbabdabbe6c"
SRC_URI[sha256sum] = "254b8441880e110623baaa1639ab564534f4eb82bd0d89a7f194ad252517007c"

GEM_NAME = "chef-config"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-addressable \
    rubygems-chef-utils \
    rubygems-fuzzyurl \
    rubygems-mixlib-config \
    rubygems-mixlib-shellout \
    rubygems-tomlrb \
"

BBCLASSEXTEND = "native"
