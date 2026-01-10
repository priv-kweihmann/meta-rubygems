# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: tilt"
DESCRIPTION = "Generic interface to multiple Ruby template engines"
HOMEPAGE = "https://github.com/jeremyevans/tilt"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://COPYING;md5=6070b204e482206d791ae800b4093464"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "1fe2c03b093f364e80055bd4f33268c2"
SRC_URI[sha256sum] = "0d5b9ba69f6a36490c64b0eee9f6e9aad517e20dcc848800a06eb116f08c6ab3"

GEM_NAME = "tilt"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
