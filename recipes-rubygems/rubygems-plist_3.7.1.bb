# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: plist"
DESCRIPTION = "Plist is a library to manipulate Property List files, also known as plists"
HOMEPAGE = "https://github.com/patsplat/plist"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=e8d008d5070d56bbd0361ddc7178b9e4"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "17b70a1787fb6de228186e22a26f3198"
SRC_URI[sha256sum] = "3f9542db1115d10fb77d87604dcb426755174920cc89453755efacb34a1cc42c"

GEM_NAME = "plist"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
