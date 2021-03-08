# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: mixlib-cli"
DESCRIPTION = "A simple mixin for CLI interfaces, including option parsing"
HOMEPAGE = "https://github.com/chef/mixlib-cli"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=8f7bb094c7232b058c7e9f2e431f389c"

SRC_URI[md5sum] = "e69e49cd2849327f4beb151a8c8bd806"
SRC_URI[sha256sum] = "e6f27be34d580f6ed71731ca46b967e57793a627131c1f6e1ed2dad39ea3bdf9"

GEM_NAME = "mixlib-cli"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
