# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: mixlib-authentication"
DESCRIPTION = "Mixes in simple per-request authentication"
HOMEPAGE = "https://github.com/chef/mixlib-authentication"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=8f7bb094c7232b058c7e9f2e431f389c"

SRC_URI[md5sum] = "7bb0a9909c8f6aa68efd02551a3fcc39"
SRC_URI[sha256sum] = "43e49f3d8b16c99d04ec1b273d3f9aa6eceac30903693f684e67595e88b1def1"

GEM_NAME = "mixlib-authentication"



inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
