# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: chef-config"
DESCRIPTION = "Chef's default configuration and config loading"
HOMEPAGE = "https://github.com/chef/chef"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=8f7bb094c7232b058c7e9f2e431f389c"

DEPENDS_class-native += "\
    rubygems-addressable-native \
    rubygems-chef-utils-native \
    rubygems-fuzzyurl-native \
    rubygems-mixlib-config-native \
    rubygems-mixlib-shellout-native \
    rubygems-tomlrb-native \
"

SRC_URI[md5sum] = "8ed83cd6097b9b2103350a6abde2fabd"
SRC_URI[sha256sum] = "d4c1b8ca7d813a597841e9f5fef42c6e9d35fcd6dde9aa92b19d1d5ba23121ca"

GEM_NAME = "chef-config"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS_${PN}_class-target += "\
    rubygems-addressable \
    rubygems-chef-utils \
    rubygems-fuzzyurl \
    rubygems-mixlib-config \
    rubygems-mixlib-shellout \
    rubygems-tomlrb \
"

BBCLASSEXTEND = "native"
