# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: tilt"
DESCRIPTION = "Generic interface to multiple Ruby template engines"
HOMEPAGE = "https://github.com/jeremyevans/tilt"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://COPYING;md5=6070b204e482206d791ae800b4093464"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "523a7644a3723c3478f14c38e10c8c63"
SRC_URI[sha256sum] = "35a99bba2adf7c1e362f5b48f9b581cce4edfba98117e34696dde6d308d84770"

GEM_NAME = "tilt"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
