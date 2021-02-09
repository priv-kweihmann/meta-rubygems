# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: chef-config"
DESCRIPTION = "Chef Infra's default configuration and config loading library"
HOMEPAGE = "https://github.com/chef/chef/tree/master/chef-config"

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
RDEPENDS_${PN}_class-target += "\
    rubygems-addressable \
    rubygems-chef-utils \
    rubygems-fuzzyurl \
    rubygems-mixlib-config \
    rubygems-mixlib-shellout \
    rubygems-tomlrb \
"

SRC_URI[md5sum] = "b0cf3648806d88d46f5798c7ac5fe0c2"
SRC_URI[sha256sum] = "7fe66ecb9933965166b660c80d79a63152d8b940a758b50e29e1f6d35b8c727b"

GEM_NAME = "chef-config"



inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
