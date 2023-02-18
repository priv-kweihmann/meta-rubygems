# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: chef-vault"
DESCRIPTION = "Data encryption support for Chef Infra using data bags"
HOMEPAGE = "https://github.com/chef/chef-vault"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=8f7bb094c7232b058c7e9f2e431f389c"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "706c2a23861159ec829119131300f36a"
SRC_URI[sha256sum] = "51888dc5b9041304627947f2340ddc3a78118678f60e4da9bbfbb6f5fcb3dbc2"

GEM_NAME = "chef-vault"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
