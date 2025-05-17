# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: chef-vault"
DESCRIPTION = "Data encryption support for Chef Infra using data bags"
HOMEPAGE = "https://github.com/chef/chef-vault"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=8f7bb094c7232b058c7e9f2e431f389c"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "292be55b6f1aea77140a86bc35482402"
SRC_URI[sha256sum] = "1ce99a2b4056e98c59fdd38be71a9d8dd0ef196ea0959a308b3bf4ec3b4b05f3"

GEM_NAME = "chef-vault"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
