# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: parallel"
DESCRIPTION = "Run any kind of code in parallel processes"
HOMEPAGE = "https://github.com/grosser/parallel"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://MIT-LICENSE.txt;md5=01d743313af3f7a981bcce70a74e06c2"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "4d194538d7413eaec77d472d4ea58be1"
SRC_URI[sha256sum] = "d86babb7a2b814be9f4b81587bf0b6ce2da7d45969fab24d8ae4bf2bb4d4c7ef"

GEM_NAME = "parallel"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
