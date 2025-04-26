# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: chef-gyoku"
DESCRIPTION = "Gyoku translates Ruby Hashes to XML"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://MIT-LICENSE;md5=bf8bd371cca512f305e2776f5a37c214"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

DEPENDS:class-native += "\
    rubygems-builder-native \
    rubygems-rexml-native \
"

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "1e58639f66a00dc4aae007b89250d6d1"
SRC_URI[sha256sum] = "7354a3cff8243cc9bbf9ac136e63ecfbf4a7b6f07622f5a092a0f7626fcff836"

GEM_NAME = "chef-gyoku"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-builder \
    rubygems-rexml \
"

BBCLASSEXTEND = "native"
