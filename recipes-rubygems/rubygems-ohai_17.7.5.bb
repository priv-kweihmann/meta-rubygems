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

SRC_URI[md5sum] = "39894c86c48e19ecc71432d18c5ca82f"
SRC_URI[sha256sum] = "24cdabb0eacda039edaac024bc476f1fec70d14583aa360063b83e8994bd4013"

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
