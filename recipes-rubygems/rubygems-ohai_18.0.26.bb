# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: ohai"
DESCRIPTION = "Ohai profiles your system and emits JSON"
HOMEPAGE = "https://github.com/chef/ohai/"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e3edf03f3aa19ea46e101aa4b956c206"

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

SRC_URI[md5sum] = "495ecf1d0138451181278f5d848942f2"
SRC_URI[sha256sum] = "0355c38b0f04b080505051c2bf822d3f1757995310efa7ef784a2ba046270c8f"

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
