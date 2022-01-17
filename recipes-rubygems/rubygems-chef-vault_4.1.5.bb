# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: chef-vault"
DESCRIPTION = "Data encryption support for Chef Infra using data bags"
HOMEPAGE = "https://github.com/chef/chef-vault"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=8f7bb094c7232b058c7e9f2e431f389c"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "1261bcc75366b29cabf1970d55f23e20"
SRC_URI[sha256sum] = "d1617ea03aa77a0664745384db503e694320a0dd19cc0351fc265b7470336299"

GEM_NAME = "chef-vault"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
