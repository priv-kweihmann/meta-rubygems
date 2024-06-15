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

SRC_URI[md5sum] = "ece3411537de8b2e222c3627f333cc2d"
SRC_URI[sha256sum] = "399439a68f1ca19856366918586a031ce8d1fd44b2bea3ee65af4f5c0e47521a"

GEM_NAME = "mixlib-shellout"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-chef-utils \
"

BBCLASSEXTEND = "native"
