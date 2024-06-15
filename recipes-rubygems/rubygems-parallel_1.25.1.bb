# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: parallel"
DESCRIPTION = "Run any kind of code in parallel processes"
HOMEPAGE = "https://github.com/grosser/parallel"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://MIT-LICENSE.txt;md5=01d743313af3f7a981bcce70a74e06c2"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "b3189c29089af5f6698693c9009365b3"
SRC_URI[sha256sum] = "12e089b9aa36ea2343f6e93f18cfcebd031798253db8260590d26a7f70b1ab90"

GEM_NAME = "parallel"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
