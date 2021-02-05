# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: mixlib-shellout"
DESCRIPTION = "Run external commands on Unix or Windows"
HOMEPAGE = "https://github.com/chef/mixlib-shellout"

LICENSE = "TODO"
LIC_FILES_CHKSUM = "file://LICENSE;md5=8f7bb094c7232b058c7e9f2e431f389c"

DEPENDS_class-native += "\
    rubygems-chef-utils-native \
"
RDEPENDS_${PN}_class-target += "\
    rubygems-chef-utils \
"

SRC_URI[md5sum] = "8eeb0bae928790721f2396e35443a562"
SRC_URI[sha256sum] = "e90bc2af9bc1fcaacab9e51b2453302a9f3ca135489dbf91d5ebc236e1053f78"

GEM_NAME = "mixlib-shellout"



inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
