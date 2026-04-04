# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: parallel"
DESCRIPTION = "Run any kind of code in parallel processes"
HOMEPAGE = "https://github.com/grosser/parallel"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://MIT-LICENSE.txt;md5=01d743313af3f7a981bcce70a74e06c2"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "82cddf4c132d5bf95bf08f288a2af1ee"
SRC_URI[sha256sum] = "66c68ec5aac0827e742aa34458aa6af20c98e0f3d79f7735da700f3367471c95"

GEM_NAME = "parallel"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
