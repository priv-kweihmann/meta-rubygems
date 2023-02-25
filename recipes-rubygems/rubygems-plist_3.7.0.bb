# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: plist"
DESCRIPTION = "Plist is a library to manipulate Property List files, also known as plists"
HOMEPAGE = "https://github.com/patsplat/plist"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=e8d008d5070d56bbd0361ddc7178b9e4"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "9b90cbd9c65736ce38b11651c54a16ad"
SRC_URI[sha256sum] = "703ca90a7cb00e8263edd03da2266627f6741d280c910abbbac07c95ffb2f073"

GEM_NAME = "plist"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
