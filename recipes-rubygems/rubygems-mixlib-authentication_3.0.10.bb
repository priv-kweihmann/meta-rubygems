# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: mixlib-authentication"
DESCRIPTION = "Mixes in simple per-request authentication"
HOMEPAGE = "https://github.com/chef/mixlib-authentication"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=8f7bb094c7232b058c7e9f2e431f389c"

SRC_URI[md5sum] = "2b6d753a64e6c13d75fc6e87727d27c9"
SRC_URI[sha256sum] = "c5be44490cebf8481171f09cc25e646663aee3ae58ea2de6d9f94bc922c2a61e"

GEM_NAME = "mixlib-authentication"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
