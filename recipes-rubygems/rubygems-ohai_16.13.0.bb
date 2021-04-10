# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: ohai"
DESCRIPTION = "Ohai profiles your system and emits JSON"
HOMEPAGE = "https://github.com/chef/ohai/"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=8f7bb094c7232b058c7e9f2e431f389c"

DEPENDS_class-native += "\
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

SRC_URI[md5sum] = "0926d3e5f48d7bd9a1d380dbc914f50e"
SRC_URI[sha256sum] = "037646ef22c126dcd1a485cf84a783ebcd52bb5d76a5149ccbf0f1842cbf7beb"

GEM_NAME = "ohai"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS_${PN}_class-target += "\
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
