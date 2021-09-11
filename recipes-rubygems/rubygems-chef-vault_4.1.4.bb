# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: chef-vault"
DESCRIPTION = "Data encryption support for Chef Infra using data bags"
HOMEPAGE = "https://github.com/chef/chef-vault"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=8f7bb094c7232b058c7e9f2e431f389c"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "d81fd4d8fdd8c411eee35ee8e6ca32b9"
SRC_URI[sha256sum] = "e1f585ca8e99da84b4bedcd5db3706e492de12721e500b9d424134981d46fea7"

GEM_NAME = "chef-vault"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
