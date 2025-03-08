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

SRC_URI[md5sum] = "60eb3c40017d1b1eff5a83905d1ff4b1"
SRC_URI[sha256sum] = "1579a547f80fbeb3312439f82b4bc0fe33a2eb7fdaedd12b323a0ee1420d2d93"

GEM_NAME = "mixlib-shellout"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-chef-utils \
"

BBCLASSEXTEND = "native"
