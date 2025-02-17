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

SRC_URI[md5sum] = "5c2ce257a51258c3681a7f80636c0639"
SRC_URI[sha256sum] = "1c5c337fbcc815537de0edfaa0af914bcd096c680dd5493b5906b3e3e5bf9c3c"

GEM_NAME = "chef-gyoku"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-builder \
    rubygems-rexml \
"

BBCLASSEXTEND = "native"
