# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: tilt"
DESCRIPTION = "Generic interface to multiple Ruby template engines"
HOMEPAGE = "https://github.com/rtomayko/tilt/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://COPYING;md5=7edc8d1de28d644c076dd037122ce3f1"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "53b8262e6027eacd0a993ab17858f003"
SRC_URI[sha256sum] = "7b180fc472cbdeb186c85d31c0f2d1e61a2c0d77e1d9fd0ca28482a9d972d6a0"

GEM_NAME = "tilt"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
