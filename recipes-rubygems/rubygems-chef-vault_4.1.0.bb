# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: chef-vault"
DESCRIPTION = "Data encryption support for Chef Infra using data bags"
HOMEPAGE = "https://github.com/chef/chef-vault"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=8f7bb094c7232b058c7e9f2e431f389c"

SRC_URI[md5sum] = "5c8885bba2b6d9b64e158dc15824146c"
SRC_URI[sha256sum] = "241d031d9dd54dd612aa6fc22b580eeb30aa4a044427ee8099fbbfc6d57fece6"

GEM_NAME = "chef-vault"



inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
