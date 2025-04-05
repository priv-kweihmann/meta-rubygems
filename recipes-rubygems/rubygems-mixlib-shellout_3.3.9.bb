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

SRC_URI[md5sum] = "bc2986d4fe57dfa4f743667ccdaf29cd"
SRC_URI[sha256sum] = "0edf5ee3b07526de8eb5219af051752fb8df2691dc030ce233e248dedf4fd388"

GEM_NAME = "mixlib-shellout"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-chef-utils \
"

BBCLASSEXTEND = "native"
