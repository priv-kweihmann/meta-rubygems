# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: gyoku"
DESCRIPTION = "Gyoku translates Ruby Hashes to XML"
HOMEPAGE = "https://github.com/savonrb/gyoku"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://MIT-LICENSE;md5=02933c5230585b35a44f9d13993f7a84"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

DEPENDS:class-native += "\
    rubygems-builder-native \
    rubygems-rexml-native \
"

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "fecd9488be9b07a250349e9bbe048e5f"
SRC_URI[sha256sum] = "389d887384c777f271cb9377bb642f20bbe0c633d1ef5af78569d4db53c1a2cd"

GEM_NAME = "gyoku"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-builder \
    rubygems-rexml \
"

BBCLASSEXTEND = "native"
