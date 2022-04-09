# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: mixlib-shellout"
DESCRIPTION = "Run external commands on Unix or Windows"
HOMEPAGE = "https://github.com/chef/mixlib-shellout"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=8f7bb094c7232b058c7e9f2e431f389c"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

DEPENDS:class-native += "\
    rubygems-chef-utils-native \
"

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "2a0d602767227cad1acd0e8ece0ab6a6"
SRC_URI[sha256sum] = "46f6d1f9c77e689a443081c5cac336203343f0f2224db06b80d39ae4cd797c7e"

GEM_NAME = "mixlib-shellout"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-chef-utils \
"

BBCLASSEXTEND = "native"
