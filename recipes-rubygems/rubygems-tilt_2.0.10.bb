# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: tilt"
DESCRIPTION = "Generic interface to multiple Ruby template engines"
HOMEPAGE = "http://github.com/rtomayko/tilt/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://COPYING;md5=7edc8d1de28d644c076dd037122ce3f1"

SRC_URI[md5sum] = "d7a090cbe2ca1f6007690fd66bfca57f"
SRC_URI[sha256sum] = "9b664f0e9ae2b500cfa00f9c65c34abc6ff1799cf0034a8c0a0412d520fac866"

GEM_NAME = "tilt"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
