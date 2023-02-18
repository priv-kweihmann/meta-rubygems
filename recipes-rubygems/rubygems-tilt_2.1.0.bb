# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: tilt"
DESCRIPTION = "Generic interface to multiple Ruby template engines"
HOMEPAGE = "https://github.com/jeremyevans/tilt"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://COPYING;md5=7edc8d1de28d644c076dd037122ce3f1"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "90f99528041182fc709f406089d5fc76"
SRC_URI[sha256sum] = "bacb211cbcaf57d170bebf1ba8ab2986952305bee5a5e935fcf2e79b9a89b0e2"

GEM_NAME = "tilt"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
