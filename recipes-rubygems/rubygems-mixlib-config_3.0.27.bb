# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: mixlib-config"
DESCRIPTION = "A class based configuration library"
HOMEPAGE = "https://github.com/chef/mixlib-config"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=8f7bb094c7232b058c7e9f2e431f389c"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

DEPENDS:class-native += "\
    rubygems-tomlrb-native \
"

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "7aa5f3a67bd15392950923bbe0002c84"
SRC_URI[sha256sum] = "d7748b1898e4f16502afec1de00b5ad65c6de405114b1b0c65ec61b1a9100148"

GEM_NAME = "mixlib-config"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-tomlrb \
"

BBCLASSEXTEND = "native"
