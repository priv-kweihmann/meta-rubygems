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

SRC_URI[md5sum] = "d7191b78092b6cfd727a2db938419a65"
SRC_URI[sha256sum] = "ff5c2bcd7dd3fcf54e8022e0bc4347d550b7cebf24cc0cd06425c5d84011323d"

GEM_NAME = "mixlib-shellout"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-chef-utils \
"

BBCLASSEXTEND = "native"
