# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: ohai"
DESCRIPTION = "Ohai profiles your system and emits JSON"
HOMEPAGE = "https://github.com/chef/ohai/"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=8f7bb094c7232b058c7e9f2e431f389c"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

DEPENDS:class-native += "\
    rubygems-chef-config-native \
    rubygems-chef-utils-native \
    rubygems-ffi-native \
    rubygems-ffi-yajl-native \
    rubygems-ipaddress-native \
    rubygems-mixlib-cli-native \
    rubygems-mixlib-config-native \
    rubygems-mixlib-log-native \
    rubygems-mixlib-shellout-native \
    rubygems-plist-native \
    rubygems-train-core-native \
    rubygems-wmi-lite-native \
"

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "87deb7f83736835f5c6061a7867453e2"
SRC_URI[sha256sum] = "c59cf16124c0a6481fb85013ec7ec5b398651b6abed782d3e06ab058ce9a5406"

GEM_NAME = "ohai"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-chef-config \
    rubygems-chef-utils \
    rubygems-ffi \
    rubygems-ffi-yajl \
    rubygems-ipaddress \
    rubygems-mixlib-cli \
    rubygems-mixlib-config \
    rubygems-mixlib-log \
    rubygems-mixlib-shellout \
    rubygems-plist \
    rubygems-train-core \
    rubygems-wmi-lite \
"

BBCLASSEXTEND = "native"
